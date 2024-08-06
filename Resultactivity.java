package com.example.quizappp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultactivity extends AppCompatActivity {
    TextView txtmarks,txttotalmarks;
    Button btnfinish;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultactivity);

        txtmarks=findViewById(R.id.txtmarks);
        txttotalmarks=findViewById(R.id.txttotalMarks);
        btnfinish=findViewById(R.id.btnfinish);

        Intent i= getIntent();
        String marks=Integer.toString(i.getIntExtra("marks",1));
        String totalMarks=Integer.toString(i.getIntExtra("totalMarks",1));

        txtmarks.setText(marks);
        txttotalmarks.setText(totalMarks);

        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}