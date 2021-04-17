package com.example.equipmentowner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        //Make Fullscreen
        getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_splashscreen );

        //Start login Activity after 2 seconds
        new Handler (  ).postDelayed ( new Runnable ( ) {
            @Override
            public void run() {
                startActivity ( new Intent ( SplashScreenActivity.this,LoginActivity.class ) );
                finish ();
            }
        }, 2000 );
    }
}