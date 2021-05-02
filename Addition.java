package com.example.calculator_bymadhavi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Addition extends AppCompatActivity {
    private TextView num1;
    private TextView num2;
    private TextView sum;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        Intent intent1 = getIntent();
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        sum = findViewById(R.id.result);
        button = findViewById(R.id.button);
    }

    public void add1(View view){
        Toast.makeText(this, "Successful..", Toast.LENGTH_SHORT).show();
        int a=Integer.parseInt(num1.getText().toString());
        int b=Integer.parseInt(num2.getText().toString());
        int add = a+b;
        sum.setText("="+add);
    }


}