package com.example.quiz_app;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next,prev,truebtn,falsebtn;
        next = findViewById(R.id.next_button);
        prev = findViewById(R.id.prev_button);
        truebtn = findViewById(R.id.true_button);
        falsebtn = findViewById(R.id.false_button);

        next.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                                        startActivity(intent);

                                    }
                                });

        truebtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Answer is Correct..", Toast.LENGTH_SHORT).show();
            }
        });
        falsebtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Answer is Incorrect..", Toast.LENGTH_SHORT).show();
            }
        });
    }


}