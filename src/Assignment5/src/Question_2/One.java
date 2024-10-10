package Question_2;

public class One {
    String Carname;
    int Timetotake;

    One(String Carname,int Timetotake){
        this.Carname=Carname;
        this.Timetotake=Timetotake;
    }
    public void enter(){
        System.out.println("Enter your car");
    }
    public void Castout(){
        System.out.println("Below is what am driving and the time i will take");
    }
    public void Castout(int timetotake){
        Timetotake = timetotake;
        System.out.println("Am on my way driving the BMW 7 series, i will take"+timetotake);
    }
    public void enter(int Timetotake){
        System.out.println("Enter your car in"+Timetotake);

    }

}
