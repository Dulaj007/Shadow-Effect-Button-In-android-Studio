package com.astro.astroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShadowButton extends AppCompatActivity {

    TextView ExampleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadow_button);

        ExampleButton = findViewById(R.id.example_btn);

        ExampleButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(ShadowButton .this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}