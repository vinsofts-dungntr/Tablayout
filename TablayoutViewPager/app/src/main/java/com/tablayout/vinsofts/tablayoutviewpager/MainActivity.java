package com.tablayout.vinsofts.tablayoutviewpager;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.tablayout.vinsofts.tablayoutviewpager.uis.HomeFragment;
import com.tablayout.vinsofts.tablayoutviewpager.uis.PhoneFragment;
import com.tablayout.vinsofts.tablayoutviewpager.uis.PropertieFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView botNavi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        botNavi=findViewById(R.id.botNavi);
        botNavi.setOnNavigationItemSelectedListener(onNaviItemSelect);
    }

    public BottomNavigationView.OnNavigationItemSelectedListener onNaviItemSelect =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment=null;
            switch (menuItem.getItemId()){
                case R.id.home:{
                    fragment=new HomeFragment();
                    LoadFragment(fragment);
                    return true;
                }
                case R.id.phone:{
                    fragment=new PhoneFragment();
                    LoadFragment(fragment);
                    return true;
                }
                case R.id.properties:{
                    fragment=new PropertieFragment();
                    LoadFragment(fragment);
                    return true;
                }
            }
            return false;
        }
    };

    public void LoadFragment(Fragment fragment){
        FragmentTransaction fts=getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.framParent,fragment);
        fts.commit();
    }
}
