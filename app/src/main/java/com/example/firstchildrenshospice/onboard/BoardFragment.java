package com.example.firstchildrenshospice.onboard;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.firstchildrenshospice.R;

public class BoardFragment extends Fragment {

    LottieAnimationView lottieAnimationView;

    public BoardFragment() {

    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_board, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textTitle = view.findViewById(R.id.textTitle);
        lottieAnimationView = view.findViewById(R.id.anim1);
        textTitle.setText("Как дела?");

        int pos = getArguments().getInt("pos");
        switch (pos) {
            case 0:
                imageView.setImageResource(R.drawable.logo);
                textTitle.setText("Добро пожаловать в мир\nПервого Детского Хосписа!");
                lottieAnimationView.setVisibility(View.INVISIBLE);
                break;
            case 1:
                textTitle.setText("Вы всегда можете посетить нас по адресу\nМолодая Гвардия 71а");
                lottieAnimationView.playAnimation();
                break;
            case 2:
                imageView.setImageResource(R.drawable.facebook);
                textTitle.setText("Ищите нас в социальных сетях!\nДобро пожаловать в нашу дружную семью!");
                lottieAnimationView.setVisibility(View.INVISIBLE);
                break;
        }
        return view;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
