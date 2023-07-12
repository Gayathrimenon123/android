package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onadd(View v){
        EditText e1,e2,e3;
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        e3=(EditText)findViewById(R.id.et3);
        int str1=Integer.parseInt(e1.getText().toString());
        int str2=Integer.parseInt(e2.getText().toString());
        int result=str1+str2;
        e3.setText(result);

    }
    public void onsub(View v){
        EditText e1,e2,e3;
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        e3=(EditText)findViewById(R.id.et3);
        int str1=Integer.parseInt(e1.getText().toString());
        int str2=Integer.parseInt(e2.getText().toString());
        int result=str1-str2;
        e3.setText(result);
    }

}