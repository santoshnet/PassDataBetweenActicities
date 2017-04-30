package com.net.santosh.passdatabetweenacticities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText name, address, email, age;
    Button save;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        age = (EditText) findViewById(R.id.age);
        save = (Button) findViewById(R.id.save);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                radioButton = (RadioButton) findViewById(checkedId);
                sex = radioButton.getText().toString();
                // Toast.makeText(getApplicationContext(),sex,Toast.LENGTH_LONG).show();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DisplayActivity.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("address", address.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("age", age.getText().toString());
                intent.putExtra("sex", sex);
                startActivity(intent);
            }
        });

    }
}
