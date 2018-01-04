package com.bloodcrown.translationanimationtest.transition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;

import com.bloodcrown.translationanimationtest.R;

public class SlideTransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Slide slide = new Slide(Gravity.LEFT);
        slide.setDuration(500);

        getWindow().setEnterTransition(slide);
        getWindow().setExitTransition(slide);
        setContentView(R.layout.activity_mdtarge);


//        slide.excludeTarget(android.R.id.navigationBarBackground, true);
//        slide.excludeTarget(android.R.id.statusBarBackground, true);
//        slide.excludeTarget(android.R.id.navigationBarBackground, true);
//        slide.excludeTarget(R.id.view_shade, true);

    }

//    @Override
//    public void finish() {
//        finishAfterTransition();
//    }
//
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }
}
