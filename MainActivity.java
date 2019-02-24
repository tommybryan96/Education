package com.example.myconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mMeter, iInches, fFeet, yYards, mMiles, nNautical;
    Button calculate, calibrate;

    int a;
    double xMeter,xInches,xFeet,xYards,xMiles,xNautical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMeter = findViewById(R.id.meter);
        iInches = findViewById(R.id.inches);
        fFeet = findViewById(R.id.fFeet);
        yYards = findViewById(R.id.yards);
        mMiles = findViewById(R.id.miles);
        nNautical = findViewById(R.id.nautical);

        calculate = findViewById(R.id.calc);

        mMeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=1;
            }
        });
        iInches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=2;
            }
        });
        fFeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=3;
            }
        });
        yYards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=4;
            }
        });
        mMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=5;
            }
        });
        nNautical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=6;
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 1){

                    xMeter = Double.parseDouble(mMeter.getText().toString());
                    xInches = xMeter * 39.3701;
                    xFeet = xMeter *  3.28084;
                    xYards = xMeter * 1.09361;
                    xMiles = xMeter * 0.00062;
                    xNautical = xMeter * 0.00054;

                    iInches.setText(String.format("%.3f",xInches));
                    fFeet.setText(String.format("%.3f",xFeet));
                    yYards.setText(String.format("%.3f",xYards));
                    mMiles.setText(String.format("%.3f",xMiles));
                    nNautical.setText(String.format("%.3f",xNautical));

                }else if (a == 2){

                    xInches = Integer.parseInt(iInches.getText().toString());

                    xMeter = xInches * 0.02540;
                    xFeet = xInches *  0.08333;
                    xYards = xInches * 0.02778;
                    xMiles = xInches * 0.00002;
                    xNautical = xInches * 0.00001;

                    mMeter.setText(String.format("%.3f", xMeter));
                    fFeet.setText(String.format("%.3f", xFeet));
                    yYards.setText(String.format("%.3f", xYards));
                    mMiles.setText(String.format("%.3f", xMiles));
                    nNautical.setText(String.format("%.3f", xNautical));

                } else if (a == 3){

                    xFeet = Double.parseDouble(fFeet.getText().toString());

                    xMeter = xFeet * 0.30480;
                    xInches = xFeet * 12;
                    xYards = xFeet * 0.33333;
                    xMiles = xFeet * 0.00019;
                    xNautical = xFeet * 0.00016;

                    mMeter.setText(String.format("%.3f", xMeter));
                    iInches.setText(String.format("%.3f", xInches));
                    yYards.setText(String.format("%.3f", xYards));
                    mMiles.setText(String.format("%.3f", xMiles));
                    nNautical.setText(String.format("%.3f", xNautical));

                } else if (a == 4){

                    xYards = Double.parseDouble(yYards.getText().toString());

                    xMeter = xYards *  0.91440;
                    xInches = xYards * 36.0000;
                    xFeet = xYards * 3.000000;
                    xMiles = xYards * 0.00057;
                    xNautical = xYards * 0.00049;

                    mMeter.setText(String.format("%.3f", xMeter));
                    iInches.setText(String.format("%.3f", xInches));
                    fFeet.setText(String.format("%.3f", fFeet));
                    mMiles.setText(String.format("%.3f", xMiles));
                    nNautical.setText(String.format("%.3f", xNautical));

                } else if (a == 5){

                    xMiles = Double.parseDouble(mMiles.getText().toString());

                    xMeter = xMiles *  1609.34;
                    xInches = xMiles * 63360.0 ;
                    xFeet = xMiles * 5280.00;
                    xYards = xMiles * 1760.00;
                    xNautical = xMiles * 0.86898;

                    mMeter.setText(String.format("%.3f", xMeter));
                    iInches.setText(String.format("%.3f", xInches));
                    fFeet.setText(String.format("%.3f", fFeet));
                    yYards.setText(String.format("%.3f", xYards));
                    nNautical.setText(String.format("%.3f", xNautical));

                } else if (a == 6){

                    xNautical = Double.parseDouble(nNautical.getText().toString());

                    xMeter = xNautical *  1609.34;
                    xInches = xNautical * 63360.0 ;
                    xFeet = xNautical * 5280.00;
                    xYards = xNautical * 1760.00;
                    xMiles = xNautical * 0.86898;

                    mMeter.setText(String.format("%.3f", xMeter));
                    iInches.setText(String.format("%.3f", xInches));
                    fFeet.setText(String.format("%.3f", fFeet));
                    yYards.setText(String.format("%.3f", xYards));
                    mMiles.setText(String.format("%.3f", xMiles));

                } else  {

                    mMeter.setText("");
                    iInches.setText("");
                    fFeet.setText("");
                    yYards.setText("");
                    mMiles.setText("");
                    nNautical.setText("");
                }
            }
        });
    }


    public void Calibrate(View v) {

        mMeter.setText("");
        iInches.setText("");
        fFeet.setText("");
        yYards.setText("");
        mMiles.setText("");
        nNautical.setText("");

    }
}
