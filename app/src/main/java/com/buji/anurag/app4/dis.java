package com.buji.anurag.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class dis extends AppCompatActivity {
TextView t1;
String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis);
        t1=(TextView)findViewById(R.id.t1) ;

        Intent i=getIntent();
        s1=i.getStringExtra("str");
        t1.setText("welcome  "+s1);


    }
}
