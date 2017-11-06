package myfirstapp.c4q.com.books;

/**
 * Created by muhaimennoor on 11/6/17.
 */

public class Books {
    String title;
    String author;
    String year;

    public Books(String title,String author,String year) {
        this.title = title;
        this.author=author;
        this.year=year;
    }

    public String getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

