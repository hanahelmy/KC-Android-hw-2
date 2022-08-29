package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    ArrayList<infos> infosArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText job = findViewById(R.id.job);
        EditText phonenumber = findViewById(R.id.num);
        EditText email = findViewById(R.id.email);
        Button create = findViewById(R.id.create);



        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(name.getText().toString()))
                {
                    name.setError("This field is required");
                    return;
                }

                 if (TextUtils.isEmpty(age.getText().toString()))
                {
                    age.setError("This field is required");
                    return;
                }

                 if (TextUtils.isEmpty(job.getText().toString()))
                {
                    job.setError("This field is required");
                    return;
                }

                 if (TextUtils.isEmpty(phonenumber.getText().toString()))
                {
                    phonenumber.setError("This field is required");
                    return;
                }

                 if (TextUtils.isEmpty(email.getText().toString()))
                {
                    email.setError("This field is required");
                    return;
                }

                else
                 {
                    String nameintent = name.getText().toString();
                    int ageintent = Integer.parseInt (age.getText().toString());
                    String jobintent = job.getText().toString();
                    int phoneintent = Integer.parseInt (phonenumber.getText().toString());
                    String emailintent = email.getText().toString();


                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                    intent.putExtra("NAME", nameintent);
                    intent.putExtra("AGE", ageintent);
                    intent.putExtra("JOB", jobintent);
                    intent.putExtra("PHONENUM", phoneintent);
                    intent.putExtra("EMAIL", emailintent);

                    startActivity(intent);



                 }
            }
        });
    }
}