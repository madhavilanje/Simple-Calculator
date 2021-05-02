package com.example.calculator_bymadhavi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Multiplication extends AppCompatActivity {

    private TextView num13;
    private TextView num23;
    private TextView result;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
        Intent intent3 = getIntent();
        num13 = findViewById(R.id.editTextNumber7);
        num23 = findViewById(R.id.editTextNumber8);
        result = findViewById(R.id.result4);
        button = findViewById(R.id.button7);
    }

    public void mul1(View view){
        Toast.makeText(this, "Successful..", Toast.LENGTH_SHORT).show();
        int a3=Integer.parseInt(num13.getText().toString());
        int b3=Integer.parseInt(num23.getText().toString());
        int mull = a3*b3;
        result.setText("="+mull);
    }
}