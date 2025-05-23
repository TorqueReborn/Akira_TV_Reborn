package com.ghostreborn.akiratv;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_browse_fragment, new MainFragment())
                .commit();
    }
}