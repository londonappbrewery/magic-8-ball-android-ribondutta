package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask;
        ask=(Button) findViewById(R.id.button);

        final ImageView img;
        img=(ImageView)findViewById(R.id.imageView);

        final int arr[]={R.drawable.ball12x,
                         R.drawable.ball22x,
                         R.drawable.ball32x,
                         R.drawable.ball42x,
                         R.drawable.ball52x,
                        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ball","button has been pressed");

                Random ob=new Random();
                int num=ob.nextInt(5);
                Log.d("alert:","Random number generated:"+num);

                img.setImageResource(arr[num]);

            }
        });


    }
}
