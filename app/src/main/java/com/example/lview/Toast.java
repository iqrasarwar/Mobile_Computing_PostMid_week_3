package com.example.lview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Toast extends AppCompatActivity {
    Button btoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        btoast = findViewById(R.id.button);
        btoast.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //inflator
                        //seting and displaying of toast
                    }
                }
        );
    }
}