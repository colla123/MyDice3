package com.example.android.mydice3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        leftDice.setOnClickListener(this);
        rightDice.setOnClickListener(this);
        final int[] dicearray  = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

    }

    @Override
    public void onClick(View v) {
        Random randomNumberGenerator = new Random();
        int number = randomNumberGenerator.nextInt(6);

        switch (v.getId()){
            case R.id.image_leftDice:
                leftDice.setImageResource(dicearray[number]);
                break;
            case R.id.image_rightDice:
                rightDice.setImageResource(dicearray[number]);
                break;
        }



    }
}
