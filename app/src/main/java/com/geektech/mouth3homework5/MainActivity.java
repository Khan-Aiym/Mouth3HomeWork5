package com.geektech.mouth3homework5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements onClickItem {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragmentLast();
    }

    private void initFragmentLast() {
        getSupportFragmentManager().beginTransaction().add(R.id.containerFirst, new FragmentMain()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerSecond, new FragmentLast()).commit();
    }

    @Override
    public void onClick(int pos) {
    }
}