package sqlite.edu.nguyenmy.lesson4_permisson.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import sqlite.edu.nguyenmy.lesson4_permisson.R;
import sqlite.edu.nguyenmy.lesson4_permisson.adapter.ItemAdapter;
import sqlite.edu.nguyenmy.lesson4_permisson.widget.ItemView;

public class MainActivity extends AppCompatActivity {
    private ItemAdapter mAdapter;
    private RecyclerView mRecycler;
    private List<ItemView> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initView();
    }

    private void initDatas() {
        mItems = new ArrayList<>();
        mItems.add(new ItemView("Donut", R.drawable.donut));
        mItems.add(new ItemView("Donut", R.drawable.donut));
        mItems.add(new ItemView("Donut", R.drawable.donut));
        mItems.add(new ItemView("Donut", R.drawable.donut));
    }

    private void initView() {
        mRecycler = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecycler.setLayoutManager(manager);
        mAdapter = new ItemAdapter(mItems);
        mRecycler.setAdapter(mAdapter);

    }
}
