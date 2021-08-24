package com.example.pocketmoneydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class ScanActivity extends AppCompatActivity {

    private static TextView year;
    ImageButton back;
    Spinner sp_year, sp_month, sp_day;
    public TextView month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        back = (ImageButton) findViewById(R.id.back);
        sp_year = (Spinner) findViewById(R.id.sp_year);
        sp_month = (Spinner) findViewById(R.id.sp_month);
        sp_day = (Spinner) findViewById(R.id.et_day);
        year = (TextView) findViewById(R.id.year);
        month = (TextView) findViewById(R.id.month);
        day = (TextView) findViewById(R.id.day);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        sp_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                year.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                month.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        sp_day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Calendar c = Calendar.getInstance();
        int nYear = c.get(Calendar.YEAR);
        int nMon = c.get(Calendar.MONTH);
        int nDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog.OnDateSetListener mDateSetListener =
                new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth) {
                        ScanActivity.year.setText(String.valueOf(year) + "년 ");
                        ScanActivity.year.setText(ScanActivity.year.getText() + String.valueOf(monthOfYear + 1)+ "월 ");
                        ScanActivity.year.setText(ScanActivity.year.getText() + String.valueOf(dayOfMonth + 1)+ "일");

                        Toast.makeText(getApplicationContext(), year, Toast.LENGTH_SHORT).show();
                    }
                };

        DatePickerDialog oDialog = new DatePickerDialog(this,
                android.R.style.Theme_DeviceDefault_Light_Dialog,
                mDateSetListener, nYear, nMon, nDay);
        oDialog.show();
    }
}