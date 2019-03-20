package com.example.homersimpson_sergioborrell;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView donut, engazul, engverde, engrojo, ojo, titulo;
    Boolean visibles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Animacion titulo
        titulo = (ImageView) findViewById(R.id.simpsonstitle);
        titulo.setBackgroundResource(R.drawable.thesimpsons_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) titulo.getBackground();
        frameAnimation.start();

        //Engranages, ojo y donut
        donut = findViewById(R.id.donut);
        engazul = findViewById(R.id.engBlau);
        engverde = findViewById(R.id.engVerd);
        engrojo = findViewById(R.id.engVermell);
        ojo = findViewById(R.id.ull);

        invisibleImagenes();

        titulo = findViewById(R.id.simpsonstitle);
        titulo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (visibles){
                    invisibleImagenes();
                }else{
                    visibleImagenes();
                }
            }
        });

    }

    public void visibleImagenes (){
        donut.setVisibility(View.VISIBLE);
        engazul.setVisibility(View.VISIBLE);
        engverde.setVisibility(View.VISIBLE);
        engrojo.setVisibility(View.VISIBLE);
        ojo.setVisibility(View.VISIBLE);
        visibles = true;
    }
    public void invisibleImagenes (){
        donut.setVisibility(View.INVISIBLE);
        engazul.setVisibility(View.INVISIBLE);
        engverde.setVisibility(View.INVISIBLE);
        engrojo.setVisibility(View.INVISIBLE);
        ojo.setVisibility(View.INVISIBLE);
        visibles = false;
    }

}
