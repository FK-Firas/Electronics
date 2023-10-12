
package seabattle.project1;

public class CellPhone extends Electronics {
    private final String networkType;

    public CellPhone(String manufacturer, double weight, double cost, double powerUsage, String networkType) {
        super(manufacturer, weight, cost, powerUsage);
        this.networkType = networkType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Network Type: " + networkType);
    }
}
    

