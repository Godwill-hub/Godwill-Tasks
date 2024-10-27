public class Car1 extends Cars{
    int Temperature_moderator;

    Car1(String Name, String Type, int Price, double Old_Mileage, double New_Mileage,int Temperature_moderator){
        super();
        this.Name=Name;
        this.Type=Type;
        this.Price=Price;
        this.Old_Mileage=Old_Mileage;
        this.New_Mileage=New_Mileage;
        this.Temperature_moderator=Temperature_moderator;
    }

    public void displaydetails(){
        System.out.println(Name);
        System.out.println(Type);
        System.out.println(Price);
        System.out.println(Old_Mileage);
        System.out.println(New_Mileage);
        System.out.println(Temperature_moderator);
    }
    void usedfor(){
        System.out.println("Takes you to office work");
    }

    double usedmileage(double Old_Mileage, double New_Mileage){
        double a=New_Mileage-Old_Mileage;
        return a;
    }
}
