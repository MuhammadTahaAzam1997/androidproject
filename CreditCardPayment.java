package com.example.muhammadsalman.trainreservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CreditCardPayment extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rg;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton;
    Button button4;
    EditText AccountNumber;
    EditText TicketNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_payment);

        AccountNumber = (EditText) findViewById(R.id.Mobile_Num);
        TicketNumber = (EditText) findViewById(R.id.Ticket_Num);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup3);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6);
        radioButton = (RadioButton) findViewById(R.id.radioButt);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (radioButton5.isChecked()) {
            if (AccountNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Account Number", Toast.LENGTH_SHORT).show();
            }
            if (TicketNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Ticket Number", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(this, "Conecting from Bank if conformed your Ticket will Print", Toast.LENGTH_SHORT).show();
        }
        if (radioButton.isChecked()) {
            if (AccountNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Account Number", Toast.LENGTH_SHORT).show();
            }
            if (TicketNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Ticket Number", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(this, "Conecting from Bank if conformed your Ticket will Print", Toast.LENGTH_SHORT).show();
        }

      else if (radioButton6.isChecked()) {
            if (AccountNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Account Number", Toast.LENGTH_SHORT).show();
            }
            if (TicketNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Ticket Number", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(this, "Conecting from Bank if conformed your Ticket will Print", Toast.LENGTH_SHORT).show();
        }


    }
    }

