package com.example.vvitcodelabs.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<String> words=new LinkedList<>();
    private RecyclerView rv;
    private MyAdapter adapter;
    //OR
    //string[] contacts={"rita","ritu","riya");
    //int[] c_images={R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_person_black_24dp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.id_recycler_View);
        for(int i=0;i<20;i++)
        {
            words.addLast("Contact"+i);
        }
        adapter = new MyAdapter(this,words);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }
}
