package test;
import movie.movie;
import movie.movieItem;
public class movieTest {
    public static void main(String[] args) {
        movie godwillsmovieList=new movie();
        movieItem film1=new movieItem("The Atonement","Jennifer Cameron");
        movieItem film2=new movieItem("Billions","Axel Rhode");
        movieItem film3=new movieItem("The Inspector","Diana Garsaw");
        godwillsmovieList.addmovieItem(film1);
        godwillsmovieList.addmovieItem(film2);
        godwillsmovieList.addmovieItem(film3);
        godwillsmovieList.printmovieDetails();
    }
}
