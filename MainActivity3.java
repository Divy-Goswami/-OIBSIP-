package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button next,prev,truebtn,falsebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        next = findViewById(R.id.next_button);
        prev = findViewById(R.id.prev_button);
        truebtn = findViewById(R.id.true_button);
        falsebtn = findViewById(R.id.false_button);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);

            }
        });

        truebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "Answer is Incorrect..", Toast.LENGTH_SHORT).show();
            }
        });
        falsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "Answer is Correct..", Toast.LENGTH_SHORT).show();
            }
        });
    }
}