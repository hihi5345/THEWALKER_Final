package com.example.kimhun.vedio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by kimhun on 2017-07-26.
 */

public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        TextView textView = (TextView) findViewById(R.id.name);
        textView.setText(name);

    }
}
