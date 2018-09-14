package com.allas.jezzarieanne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button linear = (Button) findViewById(R.id.dimahanap);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linear = new Intent(getApplicationContext(), Linear.class);
                startActivity(linear);

            }
        });
        Button relative = (Button) findViewById(R.id.didinmahanap);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relative = new Intent(getApplicationContext(), Relative.class);
                startActivity(relative);

            }
        });
        Button constraint = (Button) findViewById(R.id.diulitmahanap);
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent constraint = new Intent(getApplicationContext(), Constraint.class);
                startActivity(constraint);

            }
        });


        }
    }

