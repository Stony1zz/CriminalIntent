package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by li619 on 2018/5/10.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFramgent() {
        return new CrimeListFragment();
    }
}
