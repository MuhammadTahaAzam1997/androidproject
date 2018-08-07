package com.example.muhammadsalman.trainreservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TrainReseravtions extends AppCompatActivity implements View.OnClickListener {
    EditText user;
    EditText MobileNumber;
    EditText Email;
    EditText Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_reseravtions);
        user = (EditText) findViewById(R.id.USER);
        MobileNumber = (EditText) findViewById(R.id.MobileNumber);
        Email = (EditText) findViewById(R.id.Email);
        Pass = (EditText) findViewById(R.id.Pass);
        Button Regis = (Button) findViewById(R.id.Register);
        Regis.setOnClickListener(this);
    }
    public void onClick(View view) {
        if (user.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter name", Toast.LENGTH_SHORT).show();
        }
        else if(MobileNumber.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter Mobile Number", Toast.LENGTH_SHORT).show();
        }

        else if(Email.getText().toString().isEmpty()){
            Toast.makeText(this, "please enter Email", Toast.LENGTH_SHORT).show();
        }
        else if(Pass.getText().toString().isEmpty()){
            Toast.makeText(this, "please enter Password", Toast.LENGTH_SHORT).show();
        }
        else {
            String Username = user.getText().toString();
            Toast.makeText(this, "Register susscesful \n" + Username, Toast.LENGTH_SHORT).show();
            Intent intentRegister = new Intent(getApplicationContext(), TrainBooking.class);
            startActivity(intentRegister);

        }
    }
}

