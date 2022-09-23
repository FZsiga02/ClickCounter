package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int count;
    Button plus;
    Button minus;
    TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button) findViewById(R.id.Plus);
        minus = (Button) findViewById(R.id.Minus);
        counter = (TextView) findViewById(R.id.Counter);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = Integer.parseInt(counter.getText().toString());
                count++;
                counter.setText(count);
                if (count<0){
                    counter.setTextColor(Color.rgb(255, 0, 0));
                } else if (count>0){
                    counter.setTextColor(Color.rgb(0, 255, 0));
                } else {
                    counter.setTextColor(Color.rgb(0, 0, 255));
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = Integer.parseInt(counter.getText().toString());
                count--;
                counter.setText(count);
                if (count<0){
                    counter.setTextColor(Color.rgb(255, 0, 0));
                } else if (count>0){
                    counter.setTextColor(Color.rgb(0, 255, 0));
                } else {
                    counter.setTextColor(Color.rgb(0, 0, 255));
                }
            }
        });
    }
}