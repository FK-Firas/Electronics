
package com.mycompany.week5;


 
public class Car {
    // three private instance variables 
	private int yearModel;
	private String make;
	private int speed;
	
	// default constructor
	public Car()
	{
		yearModel = 2022;
		make = "Honda";
		speed = 10;
	}
	
	
	public Car(int yearModel,String make, int speed)   //argument constructor
	{
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;                     
	}
	
	//accessor and mutator methods
	public int getYearModel()  
	{
		return yearModel;
	}
	public void setYearModel(int yearModel)
	{
		this.yearModel = yearModel;
	}
	public String getMake()
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	
	public String toString()
	{
		return "Car Make : "+make +" Year Model : "+yearModel +"  Speed : "+speed;
	}
	
	
	public void accelerate() 
	{
		speed = speed +5;             //speed is increased by 5
	}
	public void brake()
	{
		speed = speed -5;                //speed is decreased by 5
	}
	
	
	
	
}

