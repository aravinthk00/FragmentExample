package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button first_fragment_button, second_fragment_button, third_fragment_button, fourth_fragment_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        first_fragment_button = findViewById(R.id.firstButton);
        second_fragment_button = findViewById(R.id.secondButton);
        third_fragment_button = findViewById(R.id.thirdButton);
        fourth_fragment_button = findViewById(R.id.fourthButton);

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();

        first_fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirstFragment firstFragment = new FirstFragment();
                fragmentTransaction.replace(R.id.fragment_container_view,firstFragment,firstFragment.TAG);
                fragmentTransaction.addToBackStack(null);
               // fragmentTransaction.commit();

            }
        });

        second_fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SecondFragment secondFragment = new SecondFragment();
                fragmentTransaction.replace(R.id.fragment_container_view,secondFragment,secondFragment.TAG);
                fragmentTransaction.addToBackStack(null);
                //fragmentTransaction.commit();

            }
        });

        third_fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ThirdFragment thirdFragment = new ThirdFragment();
                fragmentTransaction.replace(R.id.fragment_container_view,thirdFragment,thirdFragment.TAG);
                fragmentTransaction.addToBackStack(null);
                //fragmentTransaction.commit();

            }
        });

        fourth_fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FullscreenFragment fullscreenFragment = new FullscreenFragment();
                fragmentTransaction.replace(R.id.fragment_container_view,fullscreenFragment,fullscreenFragment.TAG);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

    }
}
