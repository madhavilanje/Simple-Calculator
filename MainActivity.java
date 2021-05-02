package com.example.calculator_bymadhavi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view){
        Toast.makeText(this, "Opening Addition", Toast.LENGTH_SHORT).show();
        button1 = findViewById(R.id.button1);
        Intent intent1 = new Intent(this, Addition.class);
        startActivity(intent1);
    }

    public void onClick2(View view){
        Toast.makeText(this, "Opening Subtraction", Toast.LENGTH_SHORT).show();
        button2 = findViewById(R.id.button1);
        Intent intent2 = new Intent(this, Subtraction.class);
        startActivity(intent2);
    }
    public void onClick3(View view){
        Toast.makeText(this, "Opening Multiplication", Toast.LENGTH_SHORT).show();
        button3 = findViewById(R.id.button1);
        Intent intent3 = new Intent(this, Multiplication.class);
        startActivity(intent3);
    }
    public void onClick4(View view){
        Toast.makeText(this, "Opening Division", Toast.LENGTH_SHORT).show();
        button4 = findViewById(R.id.button1);
        Intent intent4 = new Intent(this, Division.class);
        startActivity(intent4);
    }



}