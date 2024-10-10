package Question1;

public class Car {
    String Brand="Toyota";
    String Model="Auris";
    int No_of_seats=4;
    int Mileage=70000;

    public void displaydetails(){
        System.out.println("Brand: "+Brand);
        System.out.println("Model: "+Model);
        System.out.println("No of Seats: "+No_of_seats);
        System.out.println("Mileage: "+Mileage);
    }

    public void drive(){
        System.out.println("The car is still at the bond");
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getNo_of_seats() {
        return No_of_seats;
    }

    public int getMileage() {
        return Mileage;
    }

}
