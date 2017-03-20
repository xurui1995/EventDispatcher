package com.test.xur.eventdispatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAA","AAA");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("AAA","Activity dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

}
