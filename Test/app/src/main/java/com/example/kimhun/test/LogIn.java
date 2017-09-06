package com.example.kimhun.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LogIn extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("신상");
        Toast.makeText(this, person.toString(), Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v){
        finish();
    }
}
