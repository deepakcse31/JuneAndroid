package com.example.juneandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<CompanyInfData> companyInfDataList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.rvlist);
        companyInfDataList=new ArrayList<>();
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));
        companyInfDataList.add(new CompanyInfData("Android Developer","Android Developer",R.drawable.logo));

        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(companyInfDataList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(recyclerViewAdapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}