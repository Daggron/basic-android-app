package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView android_cookie_image_view;
    TextView status_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This function will be called when the button is clicked.
     */
    public void eatCookie(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView android_cookie_image_view = (ImageView) findViewById(R.id.android_cookie_image_view);
        android_cookie_image_view.setImageResource(R.drawable.after_cookie);

        // Find a reference to the TextView in the layout. Change the text.
        TextView status_text_view = (TextView) findViewById(R.id.status_text_view);
        status_text_view.setText("I'm so full");
    }
}