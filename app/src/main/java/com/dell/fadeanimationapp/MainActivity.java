package com.dell.fadeanimationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView boy1= (ImageView) findViewById(R.id.boy1);
     //  ImageView boy2= (ImageView) findViewById(R.id.boy2);

       //boy1.animate().alpha(0f).setDuration(2000);
       // boy2.animate().alpha(1f).setDuration(2000);

          boy1.animate().translationXBy(-1000f).setDuration(2000);
        //  boy1.animate().rotation(180f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ImageView boy1= (ImageView) findViewById(R.id.boy1);
       // boy1.animate().translationXBy(-1000f).setDuration(2000);
        /*
        ImageView boy1= (ImageView) findViewById(R.id.boy1);
        boy1.animate().translationXBy(-1000f);

        */
    }
}
