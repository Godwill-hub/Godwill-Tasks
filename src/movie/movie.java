package movie;
import java.util.ArrayList;
import java.util.List;
public class movie{
    private List<movieItem> movieItems;//Here we declare a list that will store movieItems
    public movie(){//Here we initialize our previously declared list
        movieItems = new ArrayList<>();
    }
    public void addmovieItem(movieItem item){// this method is what we will use to add our created movieItem objects to the list
        movieItems.add(item);
    }
    public void printmovieDetails(){// this method will help us to print details of all movieItems in the list
        for (movieItem item:movieItems){//this statement goes into the list called movieItems and goes through each movieItem in the list
            item.printDetails();//Calls for the printing of the content of each movieItem
        }
    }
}
