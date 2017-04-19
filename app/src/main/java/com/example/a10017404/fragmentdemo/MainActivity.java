package com.example.a10017404.fragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button_id);
        FragmentTransaction fragmentTransaction;
        final FragmentManager fragmentManager;
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        TopFragment topFragment = new TopFragment();
        fragmentTransaction.add(R.id.lineartop_id,topFragment);
        fragmentTransaction.commit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BottomFragment bottomFragment = new BottomFragment();
                fragmentTransaction.replace(R.id.lineartop_id,bottomFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
