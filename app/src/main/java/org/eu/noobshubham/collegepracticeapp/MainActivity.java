package org.eu.noobshubham.collegepracticeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numOne = (EditText) findViewById(R.id.numOneED);
        EditText numTwo = (EditText) findViewById(R.id.numTwoED);
        Button addButton = (Button) findViewById(R.id.add);
        TextView total = (TextView) findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // string -> int
                int numberOne = Integer.parseInt(numOne.getText().toString());
                int numberTwo = Integer.parseInt(numTwo.getText().toString());
                int result = numberOne + numberTwo;
                total.setText("RESULT: " + result);
            }
        });
    }
}