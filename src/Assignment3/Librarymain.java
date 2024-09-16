package Assignment3;

public class Librarymain{
    public static void main(String[] args) {
        Library library=new Library();
        Book bk1=new Book("Rich Dad Poor Dad","Robert Kiyosaki","10496",11);
        Book bk2=new Book("Cheaters never win","Wayne Brandt","03278",9);
        Book bk3=new Book("Attitude","Benjamin Dasley","87543",16);
        Member member1=new Member("Kelvin","MMB1030");
        Member member2=new Member("Carlyn","MMB1031");
        Member member3=new Member("Conor","MMB1033");
        library.addBook(bk1);
        library.addBook(bk2);
        library.addBook(bk3);
        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(member3);
        library.lendBook("87543","MMB1033"); 
        library.lendBook("10496","MMB1030"); 
        library.lendBook("03278","MMB1031");

    }
}
