package com.example.a17010621.p09basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<MathFormula> mathList;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.listViewMath);
        mathList = new ArrayList<>();
        MathFormula item1 = new MathFormula("Area of rectangle", "Length x Breadth", "Formula type is Area");
        MathFormula item2 = new MathFormula("Area of triangle", "(Length of base x Length)/2", "Formula type is Area");
        MathFormula item3 = new MathFormula("Volume of Cube", "Length x Breadth x Height", "Formula type is Volume");

        mathList.add(item1);
        mathList.add(item2);
        mathList.add(item3);


        caMath = new CustomAdapter(this, R.layout.formula, mathList);

        lvMath.setAdapter(caMath);

    }
}