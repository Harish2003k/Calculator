package com.example.CalculatorH1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
EditText etFirstValue,etSecondValue;
TextView etAns;
Button add,multiply,substact,divide,madolus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSecondValueValue=findViewById(R.id.etSecondValue);
        tvAns=findViewById(R.id.tvAns);
        add=findViewById(R.id.btnadd);
        substract=findViewById(R.id.btnsubstract);
        divide=findViewById(R.id.btndivide);
        madulus=findViewById(R.id.btnmadulus);
        multiply=findViewById(R.id.btnmultiply)
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etFirstValue.getText().toString());
                ans=firstvalue+secondvalue;
                etAns.setText("Ans is="+ans);
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etFirstValue.getText().toString());
                ans=firstvalue-secondvalue;
                etAns.setText("Ans is="+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etFirstValue.getText().toString());
                ans=firstvalue/secondvalue;
                etAns.setText("Ans is="+ans);
            }
        });
        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etFirstValue.getText().toString());
                ans=firstvalue%secondvalue;
                etAns.setText("Ans is="+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etFirstValue.getText().toString());
                ans=firstvalue*secondvalue;
                etAns.setText("Ans is="+ans);
            }
        });
    }
}