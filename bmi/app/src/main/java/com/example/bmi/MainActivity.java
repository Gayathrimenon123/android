package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e1,e2;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCalculate(View v){
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        double height=Double.parseDouble(e1.getText().toString());
        double weight=Double.parseDouble(e2.getText().toString());
        double bmi=(weight/(height*height))*10000;
        t1.setText(Double.toString(bmi));
        String str;
        if(bmi < 15){
            str="Very severely underweight";
        }
        else if(bmi >=15 && bmi <16){
            str= "Severely underweight";
        }
        else if (bmi >=16 && bmi < 18.5){
            str = "Underweight";
        }
        else if (bmi >=18.5 && bmi < 25){
            str = "Normal";
        }
        else if (bmi >= 25 && bmi < 30){
            str = "Overweight";
        }
        else if (bmi>=30 && bmi < 35 ){
            str = "Obese Class 1 - Moderately Obese";
        }
        else if (bmi>= 35 && bmi < 40){
            str = "Obese Class 2 - Severely Obese";
        }
        else {
            str = "Obese Class 3 - Very Severely Obese";

        }
        t2.setText(str);

    }
}