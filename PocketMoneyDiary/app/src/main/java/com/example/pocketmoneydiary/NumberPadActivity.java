package com.example.pocketmoneydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class NumberPadActivity extends AppCompatActivity {

    EditText et_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_pad);

        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        et_money = (EditText) findViewById(R.id.et_money);

        imm.hideSoftInputFromWindow(et_money.getWindowToken(), 0);
    }
}