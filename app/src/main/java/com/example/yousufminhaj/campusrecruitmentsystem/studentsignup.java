package com.example.yousufminhaj.campusrecruitmentsystem;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class studentsignup extends AppCompatActivity {

    Button b1 ;
    EditText email,password;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentsignup);
        auth = FirebaseAuth.getInstance();
        init();
    }

    private void init() {
        b1 = (Button) findViewById(R.id.signupw);
        email  = (EditText) findViewById(R.id.userw);
        password = (EditText) findViewById(R.id.passw);


        listner();
    }

    private void listner() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnCompleteListener(studentsignup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(studentsignup.this, "Created", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }


}
