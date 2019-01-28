package com.example.elgatodelpatron;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(5000,1000){
            @Override
            public void onTick(long millisUntilFinished){

            }
            public void onFinish(){
                Intent S = new Intent(MainActivity.this,gato.class);
                startActivity(S);
                finish();
            }
        }.start();
    }
}
