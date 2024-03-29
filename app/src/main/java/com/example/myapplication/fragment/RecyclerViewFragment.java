package com.example.myapplication.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapter.RecycleViewAdapter;
import com.example.myapplication.entity.Exercise;
import com.example.myapplication.utils.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {
    private List<Exercise> exercises;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    public static RecyclerViewFragment newInstance(String param) {
        RecyclerViewFragment fragment = new RecyclerViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("param", param);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 1. 初始化数据
        initData();
        // 2. 获取控件
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        // 3. 设置布局和分割线
        LinearLayoutManager manager = new LinearLayoutManager(container.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(container.getContext(),
                DividerItemDecoration.VERTICAL));
        // 4. 创建适配器
        RecycleViewAdapter adapter = new RecycleViewAdapter(exercises);
        // 5. 设置适配器
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void initData() {
        exercises = new ArrayList<>();

        try {
            InputStream input = getResources().getAssets().open("exercise_title.json");
            String json = IOUtils.convert(input, StandardCharsets.UTF_8);
            exercises = IOUtils.convert(json, Exercise.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initExercises() {
        exercises = new ArrayList<>();
        for(int i = 0; i < 15; i++) {
            Exercise exercise = new Exercise();
            exercise.setId(i + 1);
            switch (i) {
                case 0:
                    exercise.setTitle("第1章 Android基础入门");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_1);
                    break;
                case 1:
                    exercise.setTitle("第2章 探究活动Activity");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_2);
                    break;
                case 2:
                    exercise.setTitle("第3章 Android UI开发");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_3);
                    break;
                case 3:
                    exercise.setTitle("第4章 探究碎片Fragment");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_4);
                    break;
                case 4:
                    exercise.setTitle("第5章 广播接收者");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_5);
                    break;
                case 5:
                    exercise.setTitle("第6章 数据存储");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_1);
                    break;
                case 6:
                    exercise.setTitle("第7章 内容提供者");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_2);
                    break;
                case 7:
                    exercise.setTitle("第8章 手机多媒体");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_3);
                    break;
                case 8:
                    exercise.setTitle("第9章 网络编程");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_4);
                    break;
                case 9:
                    exercise.setTitle("第10章 服务");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_5);
                    break;
                case 10:
                    exercise.setTitle("第11章 基于位置的服务");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_1);
                    break;
                case 11:
                    exercise.setTitle("第12章 Material Design实战");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_2);
                    break;
                case 12:
                    exercise.setTitle("第13章 高级技巧");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_3);
                    break;
                case 13:
                    exercise.setTitle("第14章 开发天气App");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_4);
                    break;
                case 14:
                    exercise.setTitle("第15章 项目发布上线");
                    exercise.setSubTitle("共计5题");
                    exercise.setBackground(R.mipmap.ic_exercise_bg_5);
                    break;
                default:
                    break;
            }
            exercises.add(exercise);
        }
    }
}