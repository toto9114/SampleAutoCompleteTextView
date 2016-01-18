package com.example.tacademy.sampleautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView textView;
    MyAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        mAdapter = new MyAdapter();
        initData();
    }

    public void initData(){

    }
}
