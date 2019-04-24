package com.example.stars;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class starsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars_page);
        TextView textView = (TextView)findViewById(R.id.textView);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Intent intent = getIntent();
        String colorName = intent.getStringExtra("colorName");
        int resid = getResources().getIdentifier(colorName,"drawable",getPackageName());
        Drawable drawable = getResources().getDrawable(resid);
        imageView.setImageDrawable(drawable);
        textView.setText(colorName.toUpperCase() + " STAR");

    }
}
