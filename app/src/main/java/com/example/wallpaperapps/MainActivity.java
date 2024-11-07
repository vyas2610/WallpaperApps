package com.example.wallpaperapps;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    public  int [] images  =   {R.drawable.one ,R.drawable.two , R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.siz, R.drawable.seven,R.drawable.eight};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.ImageView);
        imageView.setBackgroundResource(images[0]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int len = images.length;
                Random random = new Random();
                int i = random.nextInt(len);
                imageView.setBackgroundResource(images[i]);


            }
        });


    }
}