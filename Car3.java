public class Car3 extends Cars {
    double Gas_outlets;

    Car3(String Name, String Type, int Price, double Old_Mileage, double New_Mileage,double Gas_outlets){
        this.Name=Name;
        this.Type=Type;
        this.Price=Price;
        this.Old_Mileage=Old_Mileage;
        this.New_Mileage=New_Mileage;
        this.Gas_outlets=Gas_outlets;
    }
    public void displaydetails(){
        System.out.println(Name);
        System.out.println(Type);
        System.out.println(Price);
        System.out.println(Old_Mileage);
        System.out.println(New_Mileage);
        System.out.println(Gas_outlets);
    }
    void usedfor() {
        System.out.println("Carries construction materials");
    }

    double usedmileage(double New_Mileage, double Old_Mileage) {
        double e=New_Mileage-Old_Mileage;
        return e;
    }
}
