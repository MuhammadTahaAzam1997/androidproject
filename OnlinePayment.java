package com.example.muhammadsalman.trainreservation;

import android.Manifest;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OnlinePayment extends AppCompatActivity implements View.OnClickListener {
    RadioGroup r;
    RadioButton radioButton8;
    RadioButton radioButton9;
    RadioButton radioButton30;
    RadioButton radioButtons;
    Button button5;
    EditText Mobile_Number;
    EditText Ticke_tNumber;
    String Mobile_Numb;
    String message= "YOUR REQUEST FOR PAYMENT HAS BEEN RECIVED";;
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_payment);


        Mobile_Number = (EditText) findViewById(R.id.Mobile_Num);
        Ticke_tNumber = (EditText) findViewById(R.id.Ticket_Num);
        RadioGroup r = (RadioGroup) findViewById(R.id.radioGroup3);
        radioButton8 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton9);
        radioButtons = (RadioButton) findViewById(R.id.radioButtons);
        radioButton30= (RadioButton) findViewById(R.id.radioButton30);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (radioButton8.isChecked()) {
            if (Mobile_Number.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Mobile Number", Toast.LENGTH_SHORT).show();
            }

            if (Ticke_tNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Ticket Number", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(this, "Conecting from Operator if conformed your Ticket will Print", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),  "SMS faild, please try again.", Toast.LENGTH_LONG).show();

        }

            if (radioButton30.isChecked()) {
                if (Mobile_Number.getText().toString().isEmpty()) {
                    Toast.makeText(this, "please enter Mobile Number", Toast.LENGTH_SHORT).show();
                                  Toast.makeText(getApplicationContext(),  "SMS faild, please try again.", Toast.LENGTH_LONG).show();
 
 }

                if (Ticke_tNumber.getText().toString().isEmpty()) {
                    Toast.makeText(this, "please enter Ticket Number", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(this, "Conecting from Operator if conformed your Ticket will Print", Toast.LENGTH_SHORT).show();
              
        } else if (radioButtons.isChecked()) {
            if (Mobile_Number.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Mobile Number", Toast.LENGTH_SHORT).show();
            } else if (Ticke_tNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter Ticket Number", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(this, "Conecting from Operator if conformed your Ticket will Print", Toast.LENGTH_SHORT).show();
        } else if (radioButton9.isChecked()) {
                if (Mobile_Number.getText().toString().isEmpty()) {
                    Toast.makeText(this, "please enter Mobile Number", Toast.LENGTH_SHORT).show();
                }

                if (Ticke_tNumber.getText().toString().isEmpty()) {
                    Toast.makeText(this, "please enter Ticket Number", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(this, "Conecting from Operator if conformed your Ticket will Print", Toast.LENGTH_SHORT).show();
            }

    }


    }
}
