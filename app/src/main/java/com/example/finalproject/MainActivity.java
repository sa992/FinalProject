package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button grammar = findViewById(R.id.button);
        Button ngrammar = findViewById(R.id.button2);
        final TextView output = findViewById(R.id.output);
        grammar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                output.setText("Clicked button 1");
            }
        });
        ngrammar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                output.setText("Clicked button 2");
            }
        });
    }
}
