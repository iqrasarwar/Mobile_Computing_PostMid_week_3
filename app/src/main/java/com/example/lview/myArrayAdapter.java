package com.example.lview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class myArrayAdapter extends ArrayAdapter<Student> {
    public myArrayAdapter(@NonNull Context context, int resource,
                          @NonNull List<Student> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student =  getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_view,parent,
                false);
        TextView name = convertView.findViewById(R.id.textView);
        TextView rollNo = convertView.findViewById(R.id.textView2);
        TextView section = convertView.findViewById(R.id.textView3);
        TextView txt = convertView.findViewById(R.id.textView9);
        txt.setText("Edit");
//        ImageView imgview = convertView.findViewById(R.id.imageView);
        name.setText(student.getName());
        rollNo.setText(student.getRollNo());
        section.setText(student.getSection());
//        imgview.setImageResource(student.getImgid());
        return convertView;
    }
}
