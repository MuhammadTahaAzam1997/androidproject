package com.example.muhammadsalman.trainreservation;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button button3;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.USER);
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                String Username = username.getText().toString();
                String Password = password.getText().toString();

                if (Username.equals("Admin") && Password.equals("Admin")) {
                    Intent intentRegister = new Intent(getApplicationContext(), TrainBooking.class);
                    startActivity(intentRegister);

                } else {

                    Toast.makeText(this, "Wrong UserName or Password", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button3:
                Intent intent = new Intent(getApplicationContext(), TrainReseravtions.class);
                startActivity(intent);
                break;
        }

    }
}



