package com.example.lview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class myToast extends AppCompatActivity {
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
                        ImageView imageView=t.findViewById(R.id.imageView2);
                        imageView.setImageResource(R.drawable.ic_launcher_background);
                        TextView myMessage= t.findViewById(R.id.textView4);
                        myMessage.setText("My Custom Toast");
                        Context context = getApplicationContext();
                        Toast.makeText(context, "INSERT TEXT HERE", Toast.LENGTH_LONG).show();
                        Toast myToast=new Toast(getApplicationContext());
                        myToast.setDuration(Toast.LENGTH_LONG);
                        myToast.setView(t);
                        myToast.show();
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