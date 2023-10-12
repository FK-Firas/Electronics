
package seabattle.project1;

public class Computers extends Electronics {
    
    private final String processorType;

    public Computers(String manufacturer, double weight, double cost, double powerUsage, String processorType) {
        super(manufacturer, weight, cost, powerUsage);
        this.processorType = processorType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type: " + processorType);
    }
}

