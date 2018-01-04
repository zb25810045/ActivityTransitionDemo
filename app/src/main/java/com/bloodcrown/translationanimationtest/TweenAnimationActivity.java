package com.bloodcrown.translationanimationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);
    }

    public void activityGoBack(View view) {

        this.finish();
        overridePendingTransition(R.anim.translate_buttom_in, R.anim.translate_top_out);

    }

    @Override
    public void onBackPressed() {
        activityGoBack(null);
    }
}
