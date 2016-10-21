package com.example.simplemessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMsg(View view) {
        Intent intent = new Intent(this, MessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editMsg);
        String msg = editText.getText().toString();
        intent.putExtra("message", msg);
        startActivity(intent);
    }
}
