package com.example.loan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1,e2,e3;
    TextView t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCalculate(View v){
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3) ;
        t4=(TextView)findViewById(R.id.t4);
        double  P=Double.parseDouble(e1.getText().toString());
        double  i=Double.parseDouble(e2.getText().toString());
        double  n=Double.parseDouble(e3.getText().toString());
        double  loan=((P*(1+i)^n)-P);
    }
}