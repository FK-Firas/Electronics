/*
Firas Kouki
Project 1: Student Registration System
Class: CS-232-001
10/30/2022
*/


import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CourseBrowsing {

   public static Scanner input;

   public static Scanner getInput() {
      return input;
   }

   public static void setInput(Scanner input) {
      CourseBrowsing.input = input;
   }

   public Map<String, Course> getCourseList() {
      return courseList;
   }

   public void setCourseList(Map<String, Course> courseList) {
      this.courseList = courseList;
   }

   public static Map<String, Course> courseList;

   public CourseBrowsing() {
      input = new Scanner(System.in);
      courseList = new HashMap<>();
   }

   @Getter
   @Setter
   public static class User {
      List<String> startTimeList;

      public User() {
         this.startTimeList = new ArrayList<>();
         this.endTimeList = new ArrayList<>();
         this.registeredCoursesList = new ArrayList<>();
      }

      List<String> endTimeList;

      public List<String> getStartTimeList() {
         return startTimeList;
      }

      public List<String> getEndTimeList() {
         return endTimeList;
      }

      public List<Course> getRegisteredCoursesList() {
         return registeredCoursesList;
      }

      List<Course> registeredCoursesList;

   }

   public static class Course {
      String name;
      String courseCode;
      String startTime;
      String endTime;
      String courseDetails;

      public Course() {
      }

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public String getCourseCode() {
         return courseCode;
      }

      public void setCourseCode(String courseCode) {
         this.courseCode = courseCode;
      }

      public String getStartTime() {
         return startTime;
      }

      public void setStartTime(String startTime) {
         this.startTime = startTime;
      }

      public String getEndTime() {
         return endTime;
      }

      public void setEndTime(String endTime) {
         this.endTime = endTime;
      }

      public String getCourseDetails() {
         return courseDetails;
      }

      public void setCourseDetails(String courseDetails) {
         this.courseDetails = courseDetails;
      }
   }

   public static void searchCourse(CourseBrowsing courseBrowsing) {
      System.out.print("Enter course number in the format SSSNNN (for example, CS201):");
      String courseNumber = input.next();
      if (courseBrowsing.getCourseList().containsKey(courseNumber)) {
         System.out.println(courseList.get(courseNumber));
      } else {
         System.out.println("This course does not exist.");
      }
   }

   public static void registerForCourse(CourseBrowsing courseBrowsing, User user) {
      System.out.println("Enter CRN number :");
      String courseNumber = input.next();
      if (!courseBrowsing.getCourseList().containsKey(courseNumber)) {
         System.out.println("Either the course was not found, or it conflicts with your current schedule!");
         return;
      }

      Course course = courseList.get(courseNumber);
      if (isCourseTimingAvailabile(course, user)) {
         user.getRegisteredCoursesList().add(course);
         user.getStartTimeList().add(course.getStartTime());
         user.getEndTimeList().add(course.getEndTime());
         System.out.println("Course Added Successfully!");
      }

   }

   private static boolean isCourseTimingAvailabile(Course course, User user) {

      List<String> startTime = user.getStartTimeList();
      List<String> endTime = user.getEndTimeList();

      for (int i = 0; i < startTime.size(); i++) {
         if ((LocalTime.parse(startTime.get(i)).isAfter(LocalTime.parse(course.getStartTime()))
               && LocalTime.parse(startTime.get(i)).isBefore(LocalTime.parse(course.getEndTime()))) ||
               LocalTime.parse(endTime.get(i)).isAfter(LocalTime.parse(course.getStartTime()))
                     && LocalTime.parse(endTime.get(i)).isBefore(LocalTime.parse(course.getEndTime()))) {
            return false;
         }
      }
      return true;
   }

   public static void viewTrialSchedule(User user) {
      for (int i = 0; i < user.getRegisteredCoursesList().size(); i++) {
         System.out.println(user.getRegisteredCoursesList().get(i));
      }
   }

   public static void showOptions() {
      System.out.println("1) Search Course");
      System.out.println("2) Register For Course");
      System.out.println("3) View Trial Schedule");
      System.out.println("4) Quit");
      System.out.println("Your choice?");
   }


   public static void main(String[] args) {
      CourseBrowsing courseBrowsing = new CourseBrowsing();
      readAllTheCourses(courseBrowsing);
      User user = createUser();
      int choice;
      while (true) {
         showOptions();
         choice = input.nextInt();

         if (choice == 1) {
            searchCourse(courseBrowsing);
         } else if (choice == 2) {
            registerForCourse(courseBrowsing, user);
         } else if (choice == 3) {
            viewTrialSchedule(user);
         } else if (choice == 4) {
            System.out.println("Thanks for using the Student Registration System");
            break;
         } else {
            System.out.println("Invalid Input. Please chose from the options below !!");
         }
      }

   }

   private static User createUser() {
      return new User();
   }

   public static Course addCourseToList(String courseInfo) {
      String[] courseDetails = courseInfo.split(" {3}");
      Course course = new Course();
      course.setName(courseDetails[0]);
      String courseNumber = String.join("", courseDetails[2].split(" "));
      course.setCourseCode(courseNumber);
      course.setStartTime(courseDetails[5]);
      course.setEndTime(courseDetails[6]);
      course.setCourseDetails(getCourseDetail(courseDetails));
      courseList.put(courseNumber, course);
      return course;
   }

   private static String getCourseDetail(String[] courseDetails) {
      String courseNumber = String.join("", courseDetails[2].split(" "));;

      return "#" + courseDetails[1] + ":" + courseNumber + "-" + courseDetails[3]
            + ", " + courseDetails[10] + ", " + courseDetails[9] + ", " + courseDetails[7]
            + ", " + courseDetails[8];
   }

   private static void readAllTheCourses(CourseBrowsing courseBrowsing) {

      try {
         File file = new File("/course.txt");
         BufferedReader br = new BufferedReader(new FileReader(file));
         String st;
         Map<String, Course> courseList = new HashMap<>();
         while ((st = br.readLine()) != null) {
            Course course = addCourseToList(st);
            courseList.put(course.getCourseCode(), course);
         }
         courseBrowsing.setCourseList(courseList);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}