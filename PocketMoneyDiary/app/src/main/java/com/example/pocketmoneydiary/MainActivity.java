package com.example.pocketmoneydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pocket, save;
    TextView money;
    Button bt_scan, menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        money = (TextView)findViewById(R.id.money);
        pocket = (EditText)findViewById(R.id.pocket);
        save = (EditText)findViewById(R.id.save);
        bt_scan = (Button)findViewById(R.id.bt_scan);
        menu = (Button)findViewById(R.id.menu);
        money.bringToFront();
        pocket.bringToFront();
        save.bringToFront();

        bt_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });
    }
}