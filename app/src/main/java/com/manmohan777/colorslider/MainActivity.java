package com.manmohan777.colorslider;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    PaletteBar paletteBar;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.frame_layout);
        paletteBar = findViewById(R.id.color_slider);
        paletteBar.setListener(new PaletteBar.PaletteBarListener() {
            @Override
            public void onHueColorSelected(int colorHue) {
                //frameLayout.setBackgroundColor(colorHue);
            }
            @Override
            public void onColorSelected(int colorHue) {
                frameLayout.setBackgroundColor(colorHue);
            }
        });
    }
}