package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    String getUser,getPass,s1="theatre",s2="123456",s3="Invalid Credentials";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        b1=(Button) findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUser=e1.getText().toString();
                getPass=e2.getText().toString();
                if (getUser.equals(s1) && getPass.equals(s2))
                {
                    Intent ob1 = new Intent(getApplicationContext(), Dashboard.class);
                    startActivity(ob1);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}