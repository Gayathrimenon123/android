package com.example.cbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
CheckBox ct1,ct2;
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ct1=(CheckBox)findViewById(R.id.c1);
        ct2=(CheckBox)findViewById(R.id.c2);
        et1=(EditText)findViewById(R.id.t1);
    }
    public void onSelect(View v){
        String str=" ";
        if(ct1.isChecked())
            str="UG";
        if(ct2.isChecked())
            str=str+"PG";
        et1.setText(str);
    }
    public void onPG(View v){
        if(ct2.isChecked())
            ct1.setChecked(true);
        else
            ct1.setChecked(false);
    }
}