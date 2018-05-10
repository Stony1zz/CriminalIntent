package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by li619 on 2018/5/10.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract android.support.v4.app.Fragment createFragemnt();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_fragment);
        setContentView(R.layout.fragment_crime);
        FragmentManager fm=getSupportFragmentManager();
        Fragment fragment=fm.findFragmentById(R.id.fragment_container);
        if (fragment==null) {
            fragment =createFragemnt();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
