package com.bloodcrown.translationanimationtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bloodcrown.translationanimationtest.fragment.FragmentAnimatorByReplaceActivity;
import com.bloodcrown.translationanimationtest.fragment.FragmentAnimatorByShowHintActivity;
import com.bloodcrown.translationanimationtest.transition.MDAnimationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTweenTransitionAnimationAtivity(View view) {
        Intent intent = new Intent(this, TweenAnimationActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.translate_top_in, R.anim.translate_buttom_out);
    }

    public void startMDTransitionAnimationAtivity(View view) {
        Intent intent = new Intent(this, MDAnimationActivity.class);
        startActivity(intent);
    }

    public void startFragmentByReplaceAnimationAtivity(View view) {
        Intent intent = new Intent(this, FragmentAnimatorByReplaceActivity.class);
        startActivity(intent);
    }

    public void startFragmentByShowHintAnimationAtivity(View view) {
        Intent intent = new Intent(this, FragmentAnimatorByShowHintActivity.class);
        startActivity(intent);
    }

}
