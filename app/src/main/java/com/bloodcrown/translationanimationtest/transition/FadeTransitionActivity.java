package com.bloodcrown.translationanimationtest.transition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;

import com.bloodcrown.translationanimationtest.R;

public class FadeTransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fade fade = new Fade();
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        setContentView(R.layout.activity_mdtarge);
    }
}
