package movie;

public class movieItem{
    private String title;//this variable stores the title of the movie
    private String author;//this variable stores the author of the movie

    public movieItem(String title,String author){//Here we have created a protected constructor to initialize the title and author
        this.title=title;
        this.author=author;
    }
    public String getTitle(){// this method returns the title of the movie
        return title;
    }
    public String getAuthor(){// this method returns the author of the movie
        return author;
    }
    void printDetails(){//this method helps us print the title and author of the movie
        System.out.println("Title:"+title+",Author:"+author);
    }
}
