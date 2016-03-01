package com.zacck.androidwearhelloworld;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {

                //make a fragment manager
                FragmentManager mFragmentManager = getFragmentManager();
                //lets make a card layout fragment operatore
                FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                //make a card and add some information to it
                CardFragment mCardFragment = CardFragment.create(getString(R.string.title),
                        getString(R.string.desc),
                        R.drawable.ic_full_sad);
                //add the above card to our view
                mFragmentTransaction.add(R.id.mFrame, mCardFragment);
                //show the card
                mFragmentTransaction.commit();


            }
        });
    }
}
