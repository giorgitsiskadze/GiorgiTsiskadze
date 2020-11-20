package com.example.giorgitsiskadze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onclicked(View view){
        EditText Model = (EditText)findViewById(R.id.edittextmodel);
        EditText Manufacturer = (EditText)findViewById(R.id.edittextmanufacturer);
        EditText doi = (EditText)findViewById(R.id.edittextdateofissue);

        if (Model.getText().toString().isEmpty() || Manufacturer.getText().toString().isEmpty() || doi.getText().toString().isEmpty()){
            Toast.makeText(this, "fill everything", Toast.LENGTH_SHORT).show();
        }
        else if (2020 - (Integer.parseInt(doi.getText().toString())) > 10){
            Toast.makeText(this, "Cannot be older than 10", Toast.LENGTH_SHORT).show();
           doi.setText("");
        }
        else if (2020 - (Integer.parseInt(doi.getText().toString())) < 1){
            Toast.makeText(this, "Can't be less than 1", Toast.LENGTH_SHORT).show();
            doi.setText("");
        }
        else {
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
        }
        Car newcar = new Car(Model.getText().toString(),Manufacturer.getText().toString(),Integer.parseInt(doi.getText().toString()));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}