package com.net.santosh.passdatabetweenacticities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView name, address, email, age, sex;
    String _name, _address, _email, _age, _sex;

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        name = (TextView) findViewById(R.id.dp_name);
        email = (TextView) findViewById(R.id.dp_email);
        address = (TextView) findViewById(R.id.dp_address);
        age = (TextView) findViewById(R.id.dp_age);
        sex = (TextView) findViewById(R.id.dp_sex);
        back = (Button) findViewById(R.id.back);

        Intent intent = getIntent();
        _name = intent.getStringExtra("name");
        _email = intent.getStringExtra("email");
        _address = intent.getStringExtra("address");
        _age = intent.getStringExtra("age");
        _sex = intent.getStringExtra("sex");
        //Toast.makeText(getApplicationContext(),_sex,Toast.LENGTH_LONG).show();

        name.setText(_name);
        email.setText(_email);
        address.setText(_address);
        age.setText(_age);
        sex.setText(_sex);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}
