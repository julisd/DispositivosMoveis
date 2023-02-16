package com.ifsc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edmin;
    EditText edmax;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        edmin=findViewById(R.id.edMin);
        edmax = findViewById(R.id.edMax);
    }

    public void sorteioNumero(View v){
        int rand = sortRandomIntervalo(
                Integer.parseInt(edmin.getText().toString()),
                Integer.parseInt(edmax.getText().toString()));

        textView.setText(Integer.toString(rand));

    }

    public int sortRandomIntervalo(int min, int max){
        return (int) (Math.random()*(max-min +1)+min);
    }

}

