package test;
import movie.movie;
import movie.movieItem;
public class movieTest {
    public static void main(String[] args) {
        movie godwillsmovieList = new movie();//Here we create an instance of the movie and we shall store our movies inside this instance
        //Now here we create some movieItem objects in other words movies
        movieItem film1 = new movieItem("The Atonement", "Jennifer Cameron");
        movieItem film2 = new movieItem("Billions", "Axel Rhode");
        movieItem film3 = new movieItem("The Inspector", "Diana Garsaw");
        // Here we add our movieItems to the movie list which is named "godwillsmovieList"
        godwillsmovieList.addmovieItem(film1);
        godwillsmovieList.addmovieItem(film2);
        godwillsmovieList.addmovieItem(film3);
        //We were told to also print out all the details of all items/(films) in the list
        godwillsmovieList.printmovieDetails();
    }
}
