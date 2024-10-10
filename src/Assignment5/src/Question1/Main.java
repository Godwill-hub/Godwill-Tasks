package Question1;

import Question1.Buyer;
import Question1.Car;
import Question1.Dealer;
import Question1.Destination;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Dealer dealer1=new Dealer();
        Destination destination1=new Destination();
        Buyer buyer1=new Buyer();

        car1.displaydetails();
        dealer1.getBrand();
        destination1.getCountry();
        buyer1.getNo_of_seats();
        car1.drive();
        dealer1.drive();
        buyer1.drive();
        car1.displaydetails();
        dealer1.displaydetails();
        destination1.displaydetails();
        buyer1.displaydetails();

    }
}