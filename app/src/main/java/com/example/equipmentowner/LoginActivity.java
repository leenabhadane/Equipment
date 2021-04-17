package com.example.equipmentowner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        //Make Fullscreen
        getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_login );



         btn =  findViewById ( R.id.Dont_have_an_account);

        btn.setOnClickListener ( view -> {
           // Intent intent = new Intent ( LoginActivity.this,RegistrationActivity.class );
            startActivity ( new Intent ( LoginActivity.this,RegistrationActivity.class ) );
        } );

    }
}