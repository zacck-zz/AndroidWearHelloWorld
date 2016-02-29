package com.zacck.androidwearhelloworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView mTextView;

    public void sayHI(View mView)
    {
        Toast.makeText(getApplicationContext(), "Hello From Wear!!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                if(null != findViewById(R.id.roundl))
                {
                    //we are in the round layout

                }
                else
                {
                    //we are in the rect layout
                }
            }
        });
    }
}
