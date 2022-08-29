package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nametxt = findViewById(R.id.nametxt);
        TextView agetxt = findViewById(R.id.agetxt);
        TextView jobtxt = findViewById(R.id.jobtxt);
        TextView numtxt = findViewById(R.id.numtxt);
        TextView emailtxt = findViewById(R.id.emailtxt);

        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("NAME");
        nametxt.setText("Name: " + name);

        int age = bundle.getInt("AGE");
        agetxt.setText("Age: " + String.valueOf(age));

        String job = bundle.getString("JOB");
        jobtxt.setText("Job: " + job);

        int phonenum = bundle.getInt("PHONENUM");
        numtxt.setText("Number: " + String.valueOf(phonenum));

        String email = bundle.getString("EMAIL");
        emailtxt.setText("E-mail: " + email);




    }
}