package com.example.kimhun.accountjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] account = {"123-456-7890", "111-111-1111","123-234-1234"};
        ListView listView = (ListView) findViewById(R.id.account_list);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, account);
        listView.setAdapter(adapter);
    }
}
