package com.rio.activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FavoriteColorActivity extends AppCompatActivity {
    TextView favoriteColorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_color);
        favoriteColorTextView = findViewById(R.id.favoriteColorTV);

        Intent intent = getIntent();
        String favoriteColor = intent.getStringExtra(MainActivity.EXTRA_FAVCOLOR);
        favoriteColorTextView.setText(favoriteColor);
    }
}