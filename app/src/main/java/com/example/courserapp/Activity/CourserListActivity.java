package com.example.courserapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.courserapp.Adapter.CourserAdapter;
import com.example.courserapp.Domain.CourserDomain;
import com.example.courserapp.R;

import java.util.ArrayList;

public class CourserListActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courser_list);
        initRecycleView();
    }

    //初始化recycleView
    private void initRecycleView() {
        //准备数据源
        ArrayList<CourserDomain> list = new ArrayList<>();
        list.add(new CourserDomain("title1","ic_1",29.9));
        list.add(new CourserDomain("title2","ic_2",29.9));
        list.add(new CourserDomain("title3","ic_3",29.9));
        list.add(new CourserDomain("title4","ic_4",29.9));
        list.add(new CourserDomain("title","ic_5",29.9));
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapter = new CourserAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}