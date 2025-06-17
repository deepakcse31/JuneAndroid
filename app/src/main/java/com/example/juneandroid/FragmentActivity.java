package com.example.juneandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class FragmentActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    public ViewPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fragment);
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tab_layout);
        adapter=new ViewPageAdapter(getSupportFragmentManager());
        adapter.add(new PageOne(),"TAB 1");
        adapter.add(new PageTwo(),"TAB 2");
        adapter.add(new PageThree(),"TAB 3");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}