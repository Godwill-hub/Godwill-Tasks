package Assignment3;

public class Librarymain{
    public static void main(String[] args) {
        Library library = new Library();//a library is created here
        // Here books have been created
        Book bk1=new Book("Rich Dad Poor Dad","Robert Kiyosaki","10496",11);
        Book bk2=new Book("Cheaters never win","Wayne Brandt","03278",9);
        Book bk3=new Book("Attitude","Benjamin Dasley","87543",16);
        //Here members are created
        Member member1=new Member("Kelvin","MMB1030");
        Member member2=new Member("Carlyn","MMB1031");
        Member member3=new Member("Conor","MMB1033");
        //Now let's add the books into the Library we created
        library.addBook(bk1);
        library.addBook(bk2);
        library.addBook(bk3);
        //Now let's add the members into the Library we created
        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(member3);
        //Let's say Conor wants the book attitude, Kelvin the book Rich Dad Poor Dad and Carlyn wants the book Cheaters never win
        library.lendBook("87543","MMB1033"); // Conor borrows Attitude
        library.lendBook("10496","MMB1030"); // Kelvin borrows Rich Dad Poor Dad
        library.lendBook("03278","MMB1031"); // Carlyn borrows Cheaters never win

    }
}
