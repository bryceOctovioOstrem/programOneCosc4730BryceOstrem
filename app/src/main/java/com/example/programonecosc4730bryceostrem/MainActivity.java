package com.example.programonecosc4730bryceostrem;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) { // got help from https://abhiandroid.com/ui/edittext#Example_I_8211_EditText_in_Android_Studio
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nameInput =  (EditText) findViewById(R.id.nameInput);//get the id for edit text
        Button button = (Button) findViewById(R.id.button);//get the id for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Hello"+ nameInput.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text

            }
        });
    }


}