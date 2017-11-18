package com.example.kuba2.kubu1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button p1, p2, p3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        p1 = (Button) findViewById(R.id.button27);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Scene1.class);
                startActivity(intent);
            }
        });

        p2 = (Button) findViewById(R.id.button25);

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Scene2.class);
                startActivity(intent);
            }
        });

        p3 = (Button) findViewById(R.id.button26);

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Scene3.class);
                startActivity(intent);
            }
        });
    }
}
