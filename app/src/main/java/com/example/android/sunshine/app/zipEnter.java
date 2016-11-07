package com.example.android.sunshine.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class zipEnter extends ActionBarActivity {

    public static String EXTRA_MESSAGE = "Now to something completely different";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zip_enter);
    }

    public void submitZip(View view)
    {
        EditText zip = (EditText) findViewById(R.id.zipCode);
        String zipText = zip.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        EXTRA_MESSAGE = zipText;
        if (EXTRA_MESSAGE.length() < 5)
        {
            Toast.makeText(getApplicationContext(), "Please enter a 5 digit zip code", Toast.LENGTH_SHORT).show();
        }
        if (EXTRA_MESSAGE.length() == 5)
            startActivity(intent);
    }

}
