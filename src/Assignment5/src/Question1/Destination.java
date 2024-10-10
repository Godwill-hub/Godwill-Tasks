package Question1;

public class Destination extends Dealer{
    int Dealer_to_Port=10;
    int From_port_to_country=5;
    String Port_Name="Mombasa";
    int No_of_clearance_points=3;
    String Final_destination="SouthSudan";

    public void displaydetails() {
        System.out.println("Dealer to Port: "+Dealer_to_Port);
        System.out.println("From Port to country: "+From_port_to_country);
        System.out.println("Port_Name: "+Port_Name);
        System.out.println("No of Clearance Points: "+No_of_clearance_points);
        System.out.println("Final Destination: "+Final_destination);
    }

    public int getDealer_to_Port() {
        return Dealer_to_Port;
    }

    public int getFrom_port_to_country() {
        return From_port_to_country;
    }

    public String getPort_Name() {
        return Port_Name;
    }

    public int getNo_of_clearance_points() {
        return No_of_clearance_points;
    }

    public String getFinal_destination() {
        return Final_destination;
    }
}
