package com.example.homersimpson_sergioborrell;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Typecasting the Image View
        ImageView view = (ImageView) findViewById(R.id.simpsonstitle);

        // Setting animation_list.xml as the background of the image view
        view.setBackgroundResource(R.drawable.thesimpsons_animation);

        // Typecasting the Animation Drawable
        AnimationDrawable frameAnimation = (AnimationDrawable) view.getBackground();
        frameAnimation.start();
    }

}
