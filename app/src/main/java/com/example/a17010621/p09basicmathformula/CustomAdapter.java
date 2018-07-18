package com.example.a17010621.p09basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MathFormula> mathList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathFormula> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.mathList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvFormula = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);



        MathFormula currentItem = mathList.get(position);
        tvName.setText(currentItem.getName());
        tvFormula.setText(currentItem.getFormula());
        tvType.setText(currentItem.getType());


        return rowView;

    }
}