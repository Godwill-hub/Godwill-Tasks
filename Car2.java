class Car2 extends Cars{
    String roofracks_type;
    double distanceDriven;
    double engine_efficiency;

    Car2(String Name, String Type, int Price, double Old_Mileage, double New_Mileage,String roofracks_type,double engine_efficiency){
        this.Name=Name;
        this.Type=Type;
        this.Price=Price;
        this.Old_Mileage=Old_Mileage;
        this.New_Mileage=New_Mileage;
        this.roofracks_type=roofracks_type;
        this.engine_efficiency=engine_efficiency;
    }
    public void displaydetails(){
        System.out.println(Name);
        System.out.println(Type);
        System.out.println(Price);
        System.out.println(Old_Mileage);
        System.out.println(New_Mileage);
        System.out.println(roofracks_type);
        System.out.println(engine_efficiency);
    }
    void usedfor(){
        System.out.println("Carries passengers");
    }

    double usedmileage(double New_Mileage, double Old_Mileage){
        double c=New_Mileage-Old_Mileage;
        return c;
    }
    public double Car() {
        this.engine_efficiency = 100.0;
        return engine_efficiency;
    }
    public void setDrive(double distance) {
        this.distanceDriven += distance;
        while (distanceDriven >= 10000) {
            reduceEfficiency();
            distanceDriven -= 10000;
        }
    }
    public void reduceEfficiency() {
        engine_efficiency *= 0.9;
        System.out.println("Efficiency reduced by 10%. New efficiency: " + engine_efficiency + "%");
    }
    public double getEngineEfficiency() {
        return engine_efficiency;
    }
}
