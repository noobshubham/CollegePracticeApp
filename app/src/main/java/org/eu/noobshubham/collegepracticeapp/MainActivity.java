package org.eu.noobshubham.collegepracticeapp;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int SELECT_PICTURE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // code to chose the image from gallery
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(view -> imageChooser());

        // code to set your name
        TextView name = findViewById(R.id.textView);
        name.setText("Enter Your Name Here!");
    }

    void imageChooser() {
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);

        // pass the constant to compare it
        // with the returned requestCode
        startActivity(Intent.createChooser(i, "Select Picture"));
    }
}