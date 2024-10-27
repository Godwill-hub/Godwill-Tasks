

public class Main {
    public static void main(String[] args) {
    Car1 Vehicle1=new Car1("Vitz","Toyota",2000,50000,70000,2);
    Car3 Vehicle3=new Car3("Sinotruck","Scania",90000,40000,50000,2);
    Car2 Vehicle2=new Car2("Hiace","Toyota",8000,40000,60000,"Parallel",92);

    drive(30000);
    Vehicle2.reduceEfficiency();
        Vehicle1.displaydetails();
        Vehicle2.displaydetails();
        Vehicle3.displaydetails();

    }

    private static void drive(int i) {
    }

}
