package com.example.android.sunshine.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;

public class splashScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Runnable waitTime = new Runnable()
        {
            public void run()
            {
                nextActivity();
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(waitTime, 3500);
    }
    public void nextActivity()
    {
        Intent intent = new Intent(this, zipEnter.class);
        startActivity(intent);
    }

}
