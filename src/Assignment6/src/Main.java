//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Properties1 Vehicle1=new Properties1("Ambulance",10000,4,2000,20000,9,"APS","carrier");
        Properties1 Vehicle2=new Properties1("Estate",20000,10,1600,1900,16,"DPS","driven");
        Properties1 Vehicle3=new Properties1("Sedan",30000,15,2200,1200,16,"DPS","driven");
        Properties1 Vehicle4=new Properties1("SUV",18000,7,6000,3000,7,"APS","carrier");
        Properties1 Vehicle5=new Properties1("Trailer",80000,3,24000,17000,6,"APS","driven");

        System.out.println("//Ambulance details");
        Vehicle1.displayAmbulance();
        System.out.println("//Estate details");
        Vehicle2.displayEstate();
        System.out.println("//Sedan details");
        Vehicle3.displaySedan();
        System.out.println("//SUV details");
        Vehicle4.displaySUV();
        System.out.println("//Trailer details");
        Vehicle5.displayTrailer();

    }
}