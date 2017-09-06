package com.example.kimhun.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editId = (EditText) findViewById(R.id.edit_id);
        EditText editPassword = (EditText) findViewById(R.id.edit_password);
        Button btnLogin = (Button) findViewById(R.id.btn_login);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, LogIn.class);
        intent.putExtra("신상", new Person("Kim Hun","남성","항공대"));
        startActivityForResult(intent, 0);
    }
}
