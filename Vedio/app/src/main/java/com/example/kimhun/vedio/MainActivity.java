package com.example.kimhun.vedio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    String name;
    EditText nameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){
        nameEditText = (EditText) findViewById(R.id.name);
        name = nameEditText.getText().toString();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);

    }
}
