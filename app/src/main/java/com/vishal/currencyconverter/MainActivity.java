package com.vishal.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public void OnEnterClick(View view)
    {
        EditText Input=findViewById(R.id.doller);
        TextView Out=findViewById(R.id.rupee);
        try {
            double d_input= Double.parseDouble(Input.getText().toString());
            Out.setText(Double.toString(d_input*82.67));

        }catch (Exception e)
        {
            Toast.makeText(this, "Invalid Value!", Toast.LENGTH_SHORT).show();
        };
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}