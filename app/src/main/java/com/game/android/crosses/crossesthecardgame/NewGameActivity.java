package com.game.android.crosses.crossesthecardgame;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NewGameActivity extends AppCompatActivity {
    int mySwitch = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

    }

    public void listVisibility(View view) {
        /*Button plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {*/
                ConstraintLayout mylist = (ConstraintLayout) findViewById(R.id.cardList);
                if(mySwitch == 0) {
                    mylist.setVisibility(View.VISIBLE);
                    mySwitch++;
                }
                else {
                    mylist.setVisibility(View.GONE);
                    mySwitch = 0;
                }

            }

}

