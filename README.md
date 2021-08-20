# ColorSlider



<img alt="readmeFiles/colorSlider.gif" src="readmeFiles/colorSlider.gif" width="300">

Created a new design for color picker in android.



<h2>Documentation</h2>

For using this color picker you have to copy  <b> "ColorSlider.java" </b> file into your project Directory

In your layout file add this to your xml
```xml
<com.manmohan777.colorslider.ColorSlider    
  android:id="@+id/color_slider"    
  android:layout_width="match_parent"    
  android:layout_height="25pt"    
  android:layout_margin="5dp"    
  android:layout_marginTop="20dp" />
```       
    
Replace "com.yourOrganisation.yourProjectName" with your package name.

In your java class you can use it like the following

```java

public class MainActivity extends AppCompatActivity {  
    ColorSlider colorSlider;  
  FrameLayout frameLayout;  
  
  @Override  
  protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
  setContentView(R.layout.activity_main);  
  frameLayout = findViewById(R.id.frame_layout);  
  colorSlider = findViewById(R.id.color_slider);  
  colorSlider.setColor(60);  
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
```

<b> public void onColorSelected(int color) </b> is a callback function which gives the color selected by user.

<b> public void onHueColorSelected(int color) </b> is a callback function which gives the Hue color selected by user.

<b> colorSlider.setColor(60); </b>  is used to set the color palette selected of the Clolor Slider.

<b> colorSlider.getCurrentColor(); </b>  is used to get selected int color of the slider Color Slider.

<b> colorSlider.getCurrentHueColor(); </b>  is used to get selected hue color of the slider Color Slider.



<H2>License</H2>
	
 	 Copyright 2020 Manmohan Singh Chauhan
 	
 	 Licensed under the Apache License, Version 2.0 (the "License");
 	 you may not use this file except in compliance with the License.
 	 You may obtain a copy of the License at
 	
 	     http://www.apache.org/licenses/LICENSE-2.0
 	
 	 Unless required by applicable law or agreed to in writing, software
	 distributed under the License is distributed on an "AS IS" BASIS,
 	 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 	 See the License for the specific language governing permissions and
 	 limitations under the License.
 	

<h2>Devoleped By</h2>
MANMOHAN SINGH CHAUHAN