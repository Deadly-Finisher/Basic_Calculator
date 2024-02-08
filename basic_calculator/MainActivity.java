package com.example.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView textView1,textView2;
    private TextView textView3;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        textView1=findViewById(R.id.textView2);
        textView2=findViewById(R.id.textView3);
        textView3=findViewById(R.id.textView4);
        editText1=findViewById(R.id.editTextNumber3);
        editText2=findViewById(R.id.editTextNumber4);
        Toast.makeText(this, "Thanks for using this app!!!!", Toast.LENGTH_SHORT).show();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Thanks for using the app !!!", Toast.LENGTH_SHORT).show();
                String s1=editText1.getText().toString();
                double a=Double.parseDouble(s1);
                String s2=editText2.getText().toString();
                double b=Double.parseDouble(s2);
                double c=a+b;
                textView3.setText("The value is ="+c);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Thanks for using the app !!!", Toast.LENGTH_SHORT).show();
                String s1=editText1.getText().toString();
                double a=Double.parseDouble(s1);
                String s2=editText2.getText().toString();
                double b=Double.parseDouble(s2);
                double c=a-b;
                textView3.setText("The value is ="+c);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Thanks for using the app !!!", Toast.LENGTH_SHORT).show();
                String s1=editText1.getText().toString();
                double a=Double.parseDouble(s1);
                String s2=editText2.getText().toString();
                double b=Double.parseDouble(s2);
                double c=a*b;
                textView3.setText("The value is ="+c);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Thanks for using the app !!!", Toast.LENGTH_SHORT).show();
                String s1=editText1.getText().toString();
                double a=Double.parseDouble(s1);
                String s2=editText2.getText().toString();
                double b=Double.parseDouble(s2);
                double c=a/b;
                textView3.setText("The value is ="+c);
            }
        });
    }
}