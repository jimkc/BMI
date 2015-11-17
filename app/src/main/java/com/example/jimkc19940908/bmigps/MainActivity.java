package com.example.jimkc19940908.bmigps;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtHeight;
    EditText edtWeight;
    TextView txtResult;
    Button btnCount;
    Button btnConnect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHeight = (EditText)findViewById(R.id.input_Height);
        edtWeight = (EditText)findViewById(R.id.input_Weight);
        txtResult = (TextView)findViewById(R.id.text_result);
        btnCount = (Button)findViewById(R.id.button_countBMI);
        btnConnect = (Button)findViewById(R.id.button_connect);

        btnCount.setOnClickListener(clickBottum);
        btnConnect.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GpsActivity.class);
                startActivity(intent);
            }
        });
    }

    double countBMI(double h,double w) {
        double result;

        result = w/(h*h);
        return result;
    }

    OnClickListener clickBottum = new OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat bmiView = new DecimalFormat("0.000");
            String h = edtHeight.getText().toString();
            String w = edtWeight.getText().toString();

            double height = Double.parseDouble(h);
            double weight = Double.parseDouble(w);


           double bmi = countBMI(height,weight);

            txtResult.setText(""+bmiView.format(bmi));

        }


    };
}









