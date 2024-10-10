package Question1;

public class Dealer extends Car{
    String Name="Autocom";
    String Country="Japan";
    String Address="Japukushi Street";

    public void displaydetails() {
        System.out.println("Name: "+Name);
        System.out.println("Country: "+Country);
        System.out.println("Address: "+Address);
    }

    public void drive(){
        System.out.println("The dealer will drive it and put it aboard");
    }

    public String getName() {
        return Name;
    }

    public String getCountry() {
        return Country;
    }

    public String getAddress() {
        return Address;
    }

}
