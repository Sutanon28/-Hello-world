package com.example.jay.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button one;
    Button two;
    Button three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button)findViewById(R.id.button);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent newActivity = new Intent(MainActivity.this,Main2Activity.class);
                newActivity.putExtra("type", "important");
                startActivity(newActivity);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent newActivity = new Intent(MainActivity.this,Main2Activity.class);
                newActivity.putExtra("type", "keep");
                startActivity(newActivity);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent newActivity = new Intent(MainActivity.this,Main2Activity.class);
                newActivity.putExtra("type", "edit");
                startActivity(newActivity);
            }
        });
    }
}
