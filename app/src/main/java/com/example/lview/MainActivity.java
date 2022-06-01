package com.example.lview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student("mahnoor","2","se19",R.drawable.ic_launcher_background));
        arraylist.add(new Student("mahnoor","3","se19",R.drawable.ic_launcher_background));
        arraylist.add(new Student("mahnoor","4","se19",R.drawable.ic_launcher_background));
        arraylist.add(new Student("mahnoor","5","se19",R.drawable.ic_launcher_background));
        myArrayAdapter list = new myArrayAdapter(this,0,arraylist);
        listview.setAdapter(list);
    }
}