package com.example.muhammadsalman.trainreservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TrainBooking extends AppCompatActivity implements View.OnClickListener {
EditText user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_booking);
      Button  bPersonal = (Button) findViewById(R.id.bPersonal);
        bPersonal.setOnClickListener(this);
        Button  TicketReservation = (Button) findViewById(R.id.TicketReservation);
        TicketReservation.setOnClickListener(this);

        Button  TrainDetails = (Button) findViewById(R.id.TrainsDetails);
        TrainDetails.setOnClickListener(this);
        Button  Paymentoptions = (Button) findViewById(R.id.Paymentoptions);
        Paymentoptions.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.bPersonal:

                Intent intents = new Intent(getApplicationContext(), CancelTicket.class);
                startActivity(intents);
                break;

            case R.id.TicketReservation:

                Intent intent = new Intent(getApplicationContext(), TicketBooking.class);
                startActivity(intent);
                break;

            case R.id.ArD:

                Intent inten = new Intent(getApplicationContext(), TrainInfo.class);
                startActivity(inten);
                break;

            case R.id.Paymentoptions:

                Intent intent2 = new Intent(getApplicationContext(), PaymentOption.class);
                startActivity(intent2);
                break;
            case R.id.TrainsDetails:

                Intent intent3 = new Intent(getApplicationContext(), TrainDetails.class);
                startActivity(intent3);
                break;
        }
        }
    }

