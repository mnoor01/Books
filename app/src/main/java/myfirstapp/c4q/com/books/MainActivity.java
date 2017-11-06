package myfirstapp.c4q.com.books;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView booksRecylerView=(RecyclerView) findViewById(R.id.books_recyclerview);

        List<Books> books=new ArrayList<>();
        books.add(new Books("dostoyevsky","Crime and Punishment","1866"));
        books.add(new Books("Dave Pelzer","A child Called it","1995"));
        books.add(new Books("Baldasaire Castiglione","Books of the Courtier","1528"));
        books.add(new Books("Homer","The odyssey","8th Century"));
        books.add(new Books("R.l. Stein","Goosebumps","1992"));
        books.add(new Books("Noam Chomsky","Manufacturing Consent","1988"));
        BookAdapter bookAdapter= new BookAdapter(books);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        booksRecylerView.setAdapter(bookAdapter);
        booksRecylerView.setLayoutManager(linearLayoutManager);
    }
}
