package myfirstapp.c4q.com.books;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by muhaimennoor on 11/6/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView author;
    private TextView year;
    public BookViewHolder(View itemView) {
        super(itemView);
        title=(TextView) itemView.findViewById(R.id.book_title_textview);
        author=(TextView) itemView.findViewById(R.id.book_author_textview);
        year=(TextView) itemView.findViewById(R.id.book_year_textview);
    }
    public void onBind(Books books){
        title.setText("title "+ books.getTitle());
        author.setText("author "+ books.getAuthor());
        year.setText("year "+ books.getYear());
    }


}
