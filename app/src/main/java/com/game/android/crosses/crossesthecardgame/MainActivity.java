package com.game.android.crosses.crossesthecardgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewGame(View view) {
        Intent startGameIntent = new Intent(this, NewGameActivity.class);
        startActivity(startGameIntent);
    }

    public void startSettings(View view) {
        Intent startSettingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(startSettingsIntent);
    }

    public void startLeaderBoards(View view) {
        Intent startLeaderBoardsIntent = new Intent(this, LeaderBoardsActivity.class);
        startActivity(startLeaderBoardsIntent);
    }
}
