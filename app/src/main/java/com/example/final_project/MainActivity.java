package com.example.final_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navi;
    Fragment Fragment1;
    Fragment Fragment2;
    Fragment Fragment3;
    Fragment Fragment4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navi = findViewById(R.id.navigation);

        Fragment1 = new Fragment1();
        Fragment2 = new Fragment2();
        Fragment3 = new Fragment3();
        Fragment4 = new Fragment4();

        getSupportFragmentManager().beginTransaction().replace(R.id.container,Fragment1).commit();


        navi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.tab1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,Fragment1).commit();
                        break;

                    case R.id.tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,Fragment2).commit();
                        break;

                    case R.id.tab3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,Fragment3).commit();
                        break;

                    case R.id.tab4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,Fragment4).commit();
                        break;
                }

                return true;
            }
        });


    }
}