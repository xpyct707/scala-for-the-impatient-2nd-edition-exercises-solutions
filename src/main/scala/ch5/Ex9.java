package ch5;

public class Ex9 {
    public static class Car {
        private final String manufacturer;
        private final String moduleName;
        private int moduleYear = -1;
        private String licensePlate = "";


        public Car(String manufacturer, String moduleName) {
            this.manufacturer = manufacturer;
            this.moduleName = moduleName;
        }

        public Car(String manufacturer, String moduleName, int moduleYear) {
            this(manufacturer, moduleName);
            this.moduleYear = moduleYear;
        }

        public Car(String manufacturer, String moduleName, String licensePlate) {
            this(manufacturer, moduleName);
            this.licensePlate = licensePlate;
        }

        public Car(String manufacturer, String moduleName, int moduleYear, String licensePlate) {
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

    public static void main(String[] args) {
        var c = new Car("Lada", "Vesta");
        var ca = new Car("Lada", "Vesta", "a270ox");
        var car = new Car("Lada", "Vesta", 2018);

        var cart = new Car("Lada", "Vesta", 2018, "a270ox");
        assert "Lada".equals(cart.getManufacturer());
        assert "Vesta".equals(cart.getModuleName());
        assert cart.getModuleYear() == 2018;
        assert "a270ox".equals(cart.getLicensePlate());

        cart.setLicensePlate("a270ox763");
        assert "a270ox763".equals(cart.getLicensePlate());
    }
}
