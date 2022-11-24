package com.example.modulocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View btn){
        EditText a = findViewById(R.id.editTextTextPersonName);
        EditText b = findViewById(R.id.editTextTextPersonName2);
        int x = Integer.parseInt(a.getText().toString());
        int y = Integer.parseInt(b.getText().toString());
        int mod = x % y;
        TextView txt = findViewById(R.id.textView);
        txt.setText("MODULUS of a & b : "+mod+"");
        Toast.makeText(this, "MODULUS of a & b : "+mod+"", Toast.LENGTH_LONG).show();
    }
}