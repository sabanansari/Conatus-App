package com.example.my.conatus;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_drawer,
                    new HomeFragment()).commit();

            navigationView.setCheckedItem(R.id.nav_dev);
        }

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment=null;
               switch (menuItem.getItemId()) {
                   case R.id.nav_team:
                       Intent inte = new Intent(MainActivity.this,TeamMainActivity.class);
                       startActivity(inte);
                       break;

                   case R.id.nav_home:
                       selectedFragment = new HomeFragment();
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragment_drawer, selectedFragment).commit();
                       break;


                   case R.id.nav_event:
                       selectedFragment = new EventFragment();
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragment_drawer, selectedFragment).commit();
                       break;

                   case R.id.nav_contact:
                       selectedFragment = new ContactFragment();
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragment_drawer, selectedFragment).commit();
                       break;

               }

                return true;
            }
        });



    }








    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.nav_dev:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_drawer,
                        new DevelopmentFragment()).commit();
                break;



            case R.id.nav_person:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_drawer,
                        new RateUsFragment()).commit();
                break;

            case R.id.nav_share:
                Toast.makeText(this,"share",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_send:
                Toast.makeText(this,"send", Toast.LENGTH_SHORT).show();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onBackPresed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);

        }else {
            super.onBackPressed();
        }
    }


}
