package com.bloodcrown.translationanimationtest.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bloodcrown.translationanimationtest.R;

public class FragmentAnimatorByReplaceActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_animator);

        includeFragment();
    }

    public void includeFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root_view, AnimatorA1Fragment.newInstance())
                .commit();
    }


}
