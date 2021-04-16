package com.example.subhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class PongActivity extends Activity {
    private PongGame mPongGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_pong);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mPongGame = new PongGame(this, size.x, size.y); // this = pongActivity
        setContentView(mPongGame);
        

    }
    @Override
    protected void onResume() {
        super.onResume();

        // More code here later in the chapter
    }

    @Override
    protected void onPause() {
        super.onPause();

        // More code here later in the chapter
    }
}