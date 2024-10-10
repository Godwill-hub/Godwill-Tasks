package Question_2;

public class Main {
    public static void main(String[] args) {
        One a=new One("Mercedes",7);
        Two b=new Two("Porsche",8);
        Three c=new Three("G-wagon",10);

         a.enter();
         b.enter();
         c.enter();
        a.enter(a.Timetotake);
        a.enter(b.Timetotake);
        a.enter(c.Timetotake);


    }
}
