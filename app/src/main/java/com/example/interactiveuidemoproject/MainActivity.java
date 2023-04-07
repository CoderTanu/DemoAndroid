package com.example.interactiveuidemoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonDark = findViewById(R.id.btnDark);
        Button buttonRead = findViewById(R.id.btnRead);
        Button buttonGreen = findViewById(R.id.btngreen);
//        View textData = findViewById(R.id.textHeader);
        View layout = findViewById(R.id.linearLayout);

        buttonDark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "changed to dark theme", Toast.LENGTH_SHORT).show();
                layout.setBackgroundResource(R.color.black);
            }
        });

        buttonRead.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "changed to read mode theme", Toast.LENGTH_SHORT).show();
               // layout.setBackgroundResource(R.color.yellow);
            }
        });
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "changed to green theme", Toast.LENGTH_SHORT).show();
              //  layout.setBackgroundResource(R.color.green);
            }
        });


    }


}