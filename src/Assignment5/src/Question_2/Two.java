package Question_2;

public class Two extends One{
    String Carname;

    Two(String Carname, int Timetotake) {
        super(Carname, Timetotake);
    }
    public void enter(){
        System.out.println("Just getting in");
    }

    public void setCastout(int timetotake){
        Timetotake = timetotake;
        System.out.println("Am on my way driving the BMW 7 series, i will take"+timetotake);
    }
    public int getTotaltime(int Timetotake){
        this.Timetotake=Timetotake;
        return Timetotake;
    }

}
