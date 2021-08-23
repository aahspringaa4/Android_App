package com.example.pocketmoneydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText money, pocket, save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        money = (EditText)findViewById(R.id.money);
        pocket = (EditText)findViewById(R.id.pocket);
        save = (EditText)findViewById(R.id.save);
        money.bringToFront();
        pocket.bringToFront();
        save.bringToFront();
    }
}