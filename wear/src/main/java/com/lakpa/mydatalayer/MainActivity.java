package com.lakpa.mydatalayer;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);
        String message = getIntent().getStringExtra("message");
        if(message==null || message.equalsIgnoreCase("")){
            message = "This is just a test";
        }

        mTextView.setText(message);

        // Enables Always-on
        setAmbientEnabled();
    }
}
