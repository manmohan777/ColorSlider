package com.manmohan777.colorslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    ColorSlider colorSlider;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.frame_layout);
        colorSlider = findViewById(R.id.color_slider);
        colorSlider.setColor(180);
        colorSlider.setListener(new ColorSlider.ColorSliderListener() {
            @Override
            public void onHueColorSelected(int colorHue) {
                //frameLayout.setBackgroundColor(colorHue);
            }

            @Override
            public void onColorSelected(int colorInt) {
                frameLayout.setBackgroundColor(colorInt);
            }
        });
    }
}