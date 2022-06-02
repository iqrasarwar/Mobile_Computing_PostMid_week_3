package com.example.lview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Toast extends AppCompatActivity {
    Button btoast;
    Button alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        btoast = findViewById(R.id.button);
        alert = findViewById(R.id.button2);
        btoast.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LayoutInflater layoutInflater = getLayoutInflater();
                        View t = layoutInflater.inflate(R.layout.customized_toast,null);

                        //inflator
                        //seting and displaying of toast
                    }
                }
        );
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //alert builder inserted here
            }
        });
    }
}