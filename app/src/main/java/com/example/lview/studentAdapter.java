//package com.example.lview;
//
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//import java.util.List;
//
//public class studentAdapter extends ArrayAdapter<studentModel> {
//    public studentAdapter(@NonNull Context context, int resource,
//                          @NonNull List<studentModel> objects) {
//        super(context, resource, objects);
//    }
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        studentModel student =  getItem(position);
//        convertView = LayoutInflater.from(getContext()).inflate(R.layout.student,parent,
//                false);
//        TextView name = convertView.findViewById(R.id.textView);
//        TextView classs = convertView.findViewById(R.id.textView2);
//        TextView enrolled = convertView.findViewById(R.id.textView3);
//
//        name.setText(student.getName());
//        classs.setText(student.getClass_S());
//        enrolled.setText(student.getEnrolled() == true?"enrolled":"NA");
//        return convertView;
//    }
//}