package com.example.expensesplit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);

        switchToWelcomeScreen();

        //PaymentCycle pc = new PaymentCycle();






    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.startBtnWelcomeScreen:
                switchToMainActivityScreen();

                break;

            default:
                break;
        }

    }

    void switchToWelcomeScreen(){

        setContentView(R.layout.layout_welcome);

    }

    void switchToMainActivityScreen(){

    }

}
