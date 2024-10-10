package Question1;

public class Buyer extends Car{
    String Name="Godwill";
    String Nationality="South-Sudanese";
    double ID=001234;

    @Override
    public void displaydetails() {
        System.out.println("Name: "+Name);
        System.out.println("Nationality: "+Nationality);
        System.out.println("ID: "+ID);
    }

    public void drive(){
        System.out.println("The buyer drives the car home.");
    }

    public String getName() {
        return Name;
    }

    public String getNationality() {
        return Nationality;
    }

    public double getID() {
        return ID;
    }
}
