package com.example.muhammadsalman.trainreservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CancelTicket extends AppCompatActivity implements View.OnClickListener {
EditText TicketNO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_ticket);
        TicketNO=(EditText)findViewById(R.id.TicketNO);
        TicketNO.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (TicketNO.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Enter Ticket Number", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Your TIcket Has Been Cancel", Toast.LENGTH_SHORT).show();
    }
}
