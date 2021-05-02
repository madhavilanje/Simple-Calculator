package com.example.calculator_bymadhavi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Subtraction extends AppCompatActivity {
        private TextView num1;
        private TextView num2;
        private TextView result5;
        private Button button5;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_subtraction);
            Intent intent2 = getIntent();
            num1 = findViewById(R.id.editTextNumber12);
            num2 = findViewById(R.id.editTextNumber13);
            result5 = findViewById(R.id.result5);
            button5 = findViewById(R.id.button5);
        }

        public void sub1(View view){
            Toast.makeText(this, "Successful..", Toast.LENGTH_SHORT).show();
            int a=Integer.parseInt(num1.getText().toString());
            int b=Integer.parseInt(num2.getText().toString());
            int subb = a-b;
            result5.setText("="+subb);
        }
    }
