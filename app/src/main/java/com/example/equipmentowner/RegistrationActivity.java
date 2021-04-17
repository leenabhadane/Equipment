package com.example.equipmentowner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {
Button AlredyAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_registration );



        AlredyAccount =  findViewById ( R.id.Already_have_an_account );

        AlredyAccount.setOnClickListener ( view -> {
            //Intent intent = new Intent ( RegistrationActivity.this,UserActivity.class );
            startActivity ( new Intent ( RegistrationActivity.this,VehiclesInfoActivity.class ) );
        } );

    }
}