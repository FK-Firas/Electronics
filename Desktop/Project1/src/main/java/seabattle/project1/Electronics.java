
package seabattle.project1;

public class Electronics {
    private final String manufacturer;
    private final double weight;
    private final double cost;
    private final double powerUsage;

    public Electronics(String manufacturer, double weight, double cost, double powerUsage) {
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.cost = cost;
        this.powerUsage = powerUsage;
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Cost: $" + cost);
        System.out.println("Power Usage: " + powerUsage + " watts");
    }
}
