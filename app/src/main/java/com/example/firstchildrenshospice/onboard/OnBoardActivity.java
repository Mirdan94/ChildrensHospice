package com.example.firstchildrenshospice.onboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.firstchildrenshospice.R;

public class OnBoardActivity extends AppCompatActivity implements BoardFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewPagerAdapter2 adapter = new ViewPagerAdapter2(getSupportFragmentManager(), 0);
        setContentView(R.layout.activity_on_board);
//        adapter.AddFragment(new FragmentPage1(), "0");
//        adapter.AddFragment(new FragmentPage2(), "1");
//        adapter.AddFragment(new FragmentPage3(), "2");
        initViewPager();
    }

    private void initViewPager() {
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), 0));
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
