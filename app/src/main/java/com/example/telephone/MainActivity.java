package com.example.telephone;


import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.net.Uri;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dial(View v) {

        EditText number=(EditText)findViewById(R.id.number);
        String toDial="tel:"+number.getText().toString();
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
    }
}