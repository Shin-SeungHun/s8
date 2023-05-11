package com.ssh.s8;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ArrayList<Movie>> allMovieList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initializeData();
        RecyclerView view = findViewById(R.id.recyclerViewVertical);

        VerticalAdapter verticalAdapter = new VerticalAdapter(this, allMovieList);

        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        view.setAdapter(verticalAdapter);
    }

    public void initializeData()
    {
        ArrayList<Movie> movieList1 = new ArrayList();

        movieList1.add(new Movie(R.drawable.b1, "곰1"));
        movieList1.add(new Movie(R.drawable.b2, "곰2"));
        movieList1.add(new Movie(R.drawable.b3, "곰3"));

        allMovieList.add(movieList1);

        ArrayList<Movie> movieList2 = new ArrayList();

        movieList2.add(new Movie(R.drawable.b4, "곰4"));
        movieList2.add(new Movie(R.drawable.b5, "곰5"));
        movieList2.add(new Movie(R.drawable.b6, "곰6"));

        allMovieList.add(movieList2);

        ArrayList<Movie> movieList3 = new ArrayList();

        movieList3.add(new Movie(R.drawable.b7, "곰7"));
        movieList3.add(new Movie(R.drawable.b8, "곰8"));
        movieList3.add(new Movie(R.drawable.b1, "곰9"));

        allMovieList.add(movieList3);

        ArrayList<Movie> movieList4 = new ArrayList();

        movieList4.add(new Movie(R.drawable.b7, "곰10"));
        movieList4.add(new Movie(R.drawable.b8, "곰11"));
        movieList4.add(new Movie(R.drawable.b1, "곰12"));

        allMovieList.add(movieList4);

        ArrayList<Movie> movieList5 = new ArrayList();

        movieList5.add(new Movie(R.drawable.b7, "곰13"));
        movieList5.add(new Movie(R.drawable.b8, "곰14"));
        movieList5.add(new Movie(R.drawable.b1, "곰15"));

        allMovieList.add(movieList5);
    }
}