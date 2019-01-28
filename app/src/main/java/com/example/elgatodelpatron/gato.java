package com.example.elgatodelpatron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);
    }
    Button btn;
    int con=0;
    String variable;
    TextView txv;
    public void btn1(View v){
        btn = findViewById(R.id.btn1);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn2(View v){
        btn = findViewById(R.id.btn2);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn3(View v){
        btn = findViewById(R.id.btn3);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn4(View v){
        btn = findViewById(R.id.btn4);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn5(View v){
        btn = findViewById(R.id.btn5);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn6(View v){
        btn = findViewById(R.id.btn6);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn7(View v){
        btn = findViewById(R.id.btn7);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn8(View v){
        btn = findViewById(R.id.btn8);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }

    public void btn9(View v){
        btn = findViewById(R.id.btn9);
        if (con==0){
            btn.setText("X");
            btn.setEnabled(false);
            con++;
            variable="X";
        }
        else {
            btn.setText("O");
            btn.setEnabled(false);
            con=0;
            variable="O";
        }
        fin(variable);
    }
    public void fin(String v){
        Button btn1, btn2, btn3;
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        txv = findViewById(R.id.txt);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn7);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
        btn1 = findViewById(R.id.btn2);
        btn2 = findViewById(R.id.btn5);
        btn3 = findViewById(R.id.btn8);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
        btn1 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn6);
        btn3 = findViewById(R.id.btn9);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
        btn1 = findViewById(R.id.btn4);
        btn2 = findViewById(R.id.btn5);
        btn3 = findViewById(R.id.btn6);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
        btn1 = findViewById(R.id.btn7);
        btn2 = findViewById(R.id.btn8);
        btn3 = findViewById(R.id.btn9);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn5);
        btn3 = findViewById(R.id.btn9);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
        btn1 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn5);
        btn3 = findViewById(R.id.btn7);
        if(btn1.getText().toString().equals(v) && btn2.getText().toString().equals(v) && btn3.getText().toString().equals(v)){
            txv.setText("Ganaron las "+v);
        }
    }
}
