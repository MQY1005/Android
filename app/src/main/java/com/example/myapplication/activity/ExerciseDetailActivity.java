package com.example.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.entity.ExerciseDatail;
import com.example.myapplication.utils.StatusUtils;

import java.util.List;

public class ExerciseDetailActivity extends AppCompatActivity {
    private int id;
    private String title;
    private List<ExerciseDatail> datails;
    private RecyclerView lvDetails;
   // private ExerciseDatailAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        StatusUtils.setImmersionMode(this);
        setContentView(R.layout.item_exercises_detail);
        initData();
        initView();
    }

    private void initView() {

    }

    private void initData() {
    }
}
