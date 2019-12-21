package com.buji.anurag.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button bt1;
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.e1);
        bt1=(Button)findViewById(R.id.b1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              s1=et1.getText().toString();
                Intent intent=new Intent(getApplicationContext(),dis.class);
                intent.putExtra("str",s1);
                startActivity(intent);


                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();

            }
        });



    }
}
