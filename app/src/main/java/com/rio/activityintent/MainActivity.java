package com.rio.activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    public static final String EXTRA_FAVCOLOR = "A8T6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionEditText = findViewById(R.id.questionET);
    }

    public void launchMaroonActivity(View view) {
        Intent intent = new Intent(this,MaroonActivity.class);
        startActivity(intent);
    }

    public void visitWebsite(View view) {
        Uri uri = Uri.parse("https://if.unmuhpnk.ac.id");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void sendQuestion(View view) {
        String favoriteColor = questionEditText.getText().toString();
        Intent intent = new Intent(this,FavoriteColorActivity.class);
        intent.putExtra(EXTRA_FAVCOLOR, favoriteColor);
        startActivity(intent);
    }
}