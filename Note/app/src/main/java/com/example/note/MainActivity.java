package com.example.DMSProject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.note.R;

public class MainActivity extends AppCompatActivity {

    Button checkButton;
    EditText getTextET;
    RecyclerView recyclerView;
    NoteAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        adapter = new NoteAdapter();
        checkButton = findViewById(R.id.bt_search);
        getTextET=findViewById(R.id.editTextTopic);
        getTextET=findViewById(R.id.editTextSubject);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()== R.id.bt_search){
                    onClicked();
                }
            }
        };
        checkButton.setOnClickListener(onClickListener);
    }


    void onClicked(){
        if(getTextET.getText().length()>0){
           String getText = getTextET.getText().toString();
           adapter.array.add(getText);
           adapter.notifyDataSetChanged();
           getTextET.setText("");
        }else{
            Toast.makeText(this, "글을 입력해주세요.", Toast.LENGTH_SHORT).show();
        }
    }
}