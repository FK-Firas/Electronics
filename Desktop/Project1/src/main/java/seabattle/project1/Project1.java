
package seabattle.project1;


public class Project1 {

    public static void main(String[] args) {
        Computers desktop = new Computers("Dell", 5.0, 800.0, 150.0, "Intel Core i7");
        CellPhone iPhone = new CellPhone("Apple", 0.2, 1000.0, 5.0, "4G");

        System.out.println("Desktop Computer:");
        desktop.displayInfo();
        
        System.out.println("\niPhone:");
        iPhone.displayInfo();
    }
}
    

