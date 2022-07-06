package com.geektech.mouth3homework5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView44);
        int position = getIntent().getIntExtra("Africa14", 0);
        switch (position){
            case 0:
                textView.setText("Black Pig");
                break;
            case 1:
                textView.setText("Yoro");
                break;
            case 2:
                textView.setText("Nier");
                break;
            case 3:
                textView.setText("Fate");
                break;
            case 4:
                textView.setText("Soccer");
                break;
            case 5:
                textView.setText("CHM14");
                break;
            case 6:
                textView.setText("Nike");
                break;
            case 7:
                textView.setText("Abibas");
                break;
            case 8:
                textView.setText("Saturn");
                break;
            case 9:
                textView.setText("Laika");
                break;
        }
    }
}