package com.example.mlextracttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Extract Text From Image Using ML")
                .setContent("Recognize text in images with ML on Android")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboard1) // int top drawable
                .setSummary("Introducing a powerful feature that allows you to effortlessly capture text from photos and images using state-of-the-art Machine Learning models.")
                .build());
        addFragment(new Step.Builder().setTitle("Copy and Use the Extracted TExt in Seconds")
                .setContent("Effortlessly copy and use the recognized text in a matter of seconds. Our intuitive user interface allows you to interact with the extracted text seamlessly.")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboard2) // int top drawable
                .setSummary("Empower your users with the ability to quickly copy and utilize the text recognized by our powerful Machine Learning models. Enhance user productivity with this user-friendly feature.")
                .build());
        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboard1) // int top drawable
                .setSummary("Explore the potential of ML-powered text recognition and discover how it can revolutionize the way your app interacts with textual content.")
                .build());
    }

    @Override
    public void finishTutorial() {
        // Your implementation
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        // Close the current activity
        finish();
    }
    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}