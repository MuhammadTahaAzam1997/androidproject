package com.example.muhammadsalman.trainreservation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TicketBooking extends AppCompatActivity implements View.OnClickListener {

    EditText EMAILS;
    EditText CNI;
    EditText oN;
    EditText NAMES;
    EditText FROM;
    EditText TO;
    EditText Destination;
    EditText NoPassenger;
    TextView TotalPrice;
    Button button2;
    Random r = new Random();
    int z = (r.nextInt(100) + 1001);
    RadioGroup rg;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    int seatno = (r.nextInt(100) + 10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_booking);
        FROM = (EditText) findViewById(R.id.FROM);
        TO = (EditText) findViewById(R.id.TO);
        Destination = (EditText) findViewById(R.id.Destination);
        NoPassenger = (EditText) findViewById(R.id.NoPassenger);
        TotalPrice = (TextView) findViewById(R.id.TotalPrice);
        NAMES = (EditText) findViewById(R.id.NAME);
        EMAILS = (EditText) findViewById(R.id.EMAIL);
        CNI = (EditText) findViewById(R.id.CNIC);
        oN = (EditText) findViewById(R.id.nO);
        TotalPrice = (TextView) findViewById(R.id.TotalPrice);
        button2 = (Button) findViewById(R.id.button2);
        TotalPrice.isEnabled();
        button2.setOnClickListener(this);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
    }

    public void onClick(View view) {

        String from = FROM.getText().toString();
        String to = TO.getText().toString();
        if (NAMES.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter name", Toast.LENGTH_SHORT).show();
        } else if (CNI.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter Mobile Number", Toast.LENGTH_SHORT).show();
        } else if (EMAILS.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter Email", Toast.LENGTH_SHORT).show();
        } else if (oN.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter Password", Toast.LENGTH_SHORT).show();
        }
        if (from.equals("Karachi") && to.equals("Sialkot")) {
            if (radioButton.isChecked()) {
                Toast.makeText(this, "Your Ticket has been booket & ticket no=" + z + " Seat No" + seatno, Toast.LENGTH_SHORT).show();
                TotalPrice.setText(Double.toString(total()));
                sendEmail();
            }
        } else if (from.equals("Karachi") && to.equals("Lahore")) {
            if (radioButton2.isChecked()) {
                Toast.makeText(this, "Your Ticket has been booket & ticket no=" + z + " Seat No=" + seatno, Toast.LENGTH_SHORT).show();
                TotalPrice.setText(Double.toString(total()));
                sendEmail();
            }
        } else if (from.equals("Karachi") && to.equals("Rawalpindi")) {

            if (radioButton3.isChecked()) {
                Toast.makeText(this, "Your Ticket has been booket & ticket no=" + z + " Seat No=" + seatno, Toast.LENGTH_SHORT).show();
                TotalPrice.setText(Double.toString(total()));
                sendEmail();
            }
        } else if (from.equals("Karachi") && to.equals("Quetta")) {
            if (radioButton4.isChecked()) {
                Toast.makeText(this, "Your Ticket has been booket & ticket no=" + z + " Seat No=" + seatno, Toast.LENGTH_SHORT).show();
                TotalPrice.setText(Double.toString(total()));
                sendEmail();
            }
        } else {

            Toast.makeText(this, "Please select right choice ", Toast.LENGTH_SHORT).show();
        }

    }


    private double total() {

        double i = Double.parseDouble(NoPassenger.getText().toString()) * 3700;
        return i;
    }

    @SuppressLint("LongLogTag")
    protected void sendEmail() {
        EditText[] TO = {EMAILS};

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "From TJBS RAILWAY \n Name "+NAMES+ " Seat NO="+seatno+ " YOUR TICKET BOOKET"+TotalPrice);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(TicketBooking.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }


    }
}