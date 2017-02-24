package com.example.yousufminhaj.campusrecruitmentsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class studentlogin extends AppCompatActivity {

    Button b1,b2 ;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlogin);
        init();
    }

    private void init() {
        b1 = (Button) findViewById(R.id.loginstudent);
        b2 = (Button) findViewById(R.id.signup);
        username= (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        listner();
    }

    private void listner() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(studentlogin.this,studentsignup.class);
                startActivity(i);
            }
        });
    }

}
