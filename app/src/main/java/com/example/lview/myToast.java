package com.example.lview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class myToast extends AppCompatActivity {
    Button btoast;
    String [] Colors = {"Red", "Green", "Blue"};
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
                /*AlertDialog.Builder builder = new AlertDialog.Builder(myToast.this);
                builder.setMessage("Message you want to show");
                builder.setTitle("Alert !");
                builder.setCancelable(false);
                builder.setPositiveButton(
                        "Positive Button",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int asdf)
                            {
                                finish(); //close the app
                            }
                        });
                builder.setNegativeButton(
                        "Negative Button",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();*/
               /* AlertDialog.Builder builder = new AlertDialog.Builder(myToast.this);
                        builder.setIcon(R.drawable.ic_launcher_foreground)
                        .setTitle("Test Dialog")
                        .setMessage("Do you want to leave us")
                        .setPositiveButton("Leave", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("Stay", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setNeutralButton("What up", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Click Leave to close and Stay to cancel",
                                        Toast.LENGTH_LONG).show();
                            }
                        }).show();*/
                AlertDialog.Builder builder = new AlertDialog.Builder(myToast.this);
                builder.setTitle("SetColor")
                        .setItems(Colors, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(myToast.this, Colors[which], Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
    }
}