package Question_2;

public class Three extends One{
    String Carname;

    Three(String Carname, int Timetotake) {
        super(Carname, Timetotake);
    }
    public void enter(){
        System.out.println("Jumping in, in 10seconds");
    }
    public void setCastout(int timetotake){
        Timetotake = timetotake;
        System.out.println("Am on my way driving the BMW 7 series, i will take"+timetotake);
    }

}
