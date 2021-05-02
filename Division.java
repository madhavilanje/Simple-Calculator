package com.example.calculator_bymadhavi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Division extends AppCompatActivity {

    private TextView num14;
    private TextView num24;
    private TextView result4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        Intent intent4 = getIntent();
        num14 = findViewById(R.id.editTextNumber5);
        num24 = findViewById(R.id.editTextNumber6);
        result4= findViewById(R.id.result3);
        button = findViewById(R.id.button6);
    }

    public void div1(View view){
        Toast.makeText(this, "Successful..", Toast.LENGTH_SHORT).show();
        Double a4=Double.parseDouble(num14.getText().toString());
        Double b4=Double.parseDouble(num24.getText().toString());
        Double div = a4/b4;
        result4.setText("="+div);
    }
}