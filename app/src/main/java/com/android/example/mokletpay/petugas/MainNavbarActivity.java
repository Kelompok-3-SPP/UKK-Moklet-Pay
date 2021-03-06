package com.android.example.mokletpay.petugas;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.android.example.mokletpay.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainNavbarActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navbar);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadFragment(new MainPetugasActivity());

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.home:
                fragment = new MainPetugasActivity();
                break;
            case R.id.data:
                fragment = new MainDatasiswaPetugas();
                break;

        }
        return loadFragment(fragment);
    }}
