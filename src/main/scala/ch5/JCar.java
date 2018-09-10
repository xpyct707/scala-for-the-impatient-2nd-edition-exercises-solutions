package ch5;

public class JCar {
    private final String manufacturer;
    private final String moduleName;
    private int moduleYear = -1;
    private String licensePlate = "";
    public JCar(String manufacturer, String moduleName) {
        this.manufacturer = manufacturer;
        this.moduleName = moduleName;
    }
    public JCar(String manufacturer, String moduleName, int moduleYear) {
        this(manufacturer, moduleName);
        this.moduleYear = moduleYear;
    }
    public JCar(String manufacturer, String moduleName, String licensePlate) {
        this(manufacturer, moduleName);
        this.licensePlate = licensePlate;
    }
    public JCar(String manufacturer, String moduleName, int moduleYear, String licensePlate) {
        this(manufacturer, moduleName, moduleYear);
        this.licensePlate = licensePlate;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModuleName() {
        return moduleName;
    }
    public int getModuleYear() {
        return moduleYear;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
