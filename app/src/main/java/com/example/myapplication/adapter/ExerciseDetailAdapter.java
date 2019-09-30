package com.example.myapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.entity.ExerciseDatail;

import java.util.ArrayList;
import java.util.List;

public class ExerciseDetailAdapter extends RecyclerView.Adapter<ExerciseDetailAdapter.ViewHolder> {
    private final List<ExerciseDatail> details;
    private final ArrayList<Object> selectedPos;
    private final OnSelectListener onSelectListener;

    public interface OnSelectListener{
        void onSelectA(int position, ImageView ivA,ImageView ivB,ImageView ivC,ImageView ivD);
        void onSelectB(int position, ImageView ivA,ImageView ivB,ImageView ivC,ImageView ivD);
        void onSelectC(int position, ImageView ivA,ImageView ivB,ImageView ivC,ImageView ivD);
        void onSelectD(int position, ImageView ivA,ImageView ivB,ImageView ivC,ImageView ivD);

    }
    public ExerciseDetailAdapter(List<ExerciseDatail> details,OnSelectListener onSelectListener){
        this.details=details;
        selectedPos=new ArrayList<>();
        this.onSelectListener=onSelectListener;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exercises_detail,parent,false);
        ViewHolder holder=new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        ExerciseDatail detail=details.get(position);
       // holder.subject.setText(detail.getSubject());
        // holder.tvA.setText(detail.getA());
        // holder.tvB.setText(detail.getB());
        // holder.tvC.setText(detail.getC());
        // holder.tvD.setText(detail.getD());


    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
