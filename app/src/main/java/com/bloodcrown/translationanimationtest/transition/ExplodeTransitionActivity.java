package com.bloodcrown.translationanimationtest.transition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;

import com.bloodcrown.translationanimationtest.R;

public class ExplodeTransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Explode explode = new Explode();
        getWindow().setEnterTransition(explode);
        getWindow().setExitTransition(explode);

        setContentView(R.layout.activity_mdtarge);
    }

}
