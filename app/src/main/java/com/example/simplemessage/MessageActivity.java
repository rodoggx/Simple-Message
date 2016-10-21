package com.example.simplemessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView textView = (TextView) findViewById(R.id.textVw);
        //Intent intent = getIntent();
        //String msg = intent.getStringExtra("message");

        String msg = getIntent().getStringExtra("message");
        textView.setText(msg);
    }
}
