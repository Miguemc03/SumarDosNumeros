package com.example.sumardosnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText n1,n2;
Button bSumar;
TextView Sol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextNumber1);
        n2=findViewById(R.id.editTextNumber2);
        bSumar=findViewById(R.id.buttonSumar);
        Sol=findViewById(R.id.Resultado);
        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sol.setText(Integer.getInteger(n1.getText().toString()+Integer.getInteger(n2.getText().toString())));
            }
        });
    }
}