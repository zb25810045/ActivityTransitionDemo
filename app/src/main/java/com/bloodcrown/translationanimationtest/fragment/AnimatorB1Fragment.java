package com.bloodcrown.translationanimationtest.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.bloodcrown.translationanimationtest.R;


public class AnimatorB1Fragment extends Fragment {

    private View mRootView;
    private Button btn_back;

    public AnimatorB1Fragment() {

    }

    public static AnimatorB1Fragment newInstance() {
        return new AnimatorB1Fragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_b_animator, container, false);
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_back = (Button) mRootView.findViewById(R.id.view_button);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void goBack() {
        Toast.makeText(getContext(), "AAAAAAAA", Toast.LENGTH_SHORT).show();
        getActivity().getSupportFragmentManager()
                .popBackStack();
    }

}
