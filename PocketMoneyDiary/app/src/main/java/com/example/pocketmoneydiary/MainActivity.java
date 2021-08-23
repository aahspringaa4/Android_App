package com.example.pocketmoneydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pocket, save;
    TextView money;
    Button bt_scan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        money = (TextView)findViewById(R.id.money);
        pocket = (EditText)findViewById(R.id.pocket);
        save = (EditText)findViewById(R.id.save);
        bt_scan = (Button)findViewById(R.id.bt_scan);
        money.bringToFront();
        pocket.bringToFront();
        save.bringToFront();
    }
}