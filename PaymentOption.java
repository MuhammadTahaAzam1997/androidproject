package com.example.muhammadsalman.trainreservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PaymentOption extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rg;
    RadioButton radio1;
    RadioButton radio2;
    Button Bsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_option);
        RadioGroup rg = (RadioGroup) findViewById(R.id.RadioGroup1);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
         Bsubmit= (Button) findViewById(R.id.Bsubmit);
        Bsubmit.setOnClickListener(this);
    }
    public void onClick(View view) {

        if (radio1.isChecked()) {
            Intent intent = new Intent(getApplicationContext(), OnlinePayment.class);
            startActivity(intent);
        }
        else if (radio2.isChecked()) {
            Intent intent = new Intent(getApplicationContext(), CreditCardPayment.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Please Select Any Option", Toast.LENGTH_SHORT).show();
        }
    }
}