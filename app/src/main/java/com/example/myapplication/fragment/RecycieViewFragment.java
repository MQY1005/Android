package com.example.myapplication.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.myapplication.R;


public class RecycieViewFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param";


    // TODO: Rename and change types of parameters
    private String mParam;


    private OnFragmentInteractionListener mListener;

    public RecycieViewFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static RecycieViewFragment newInstance() {
        RecycieViewFragment fragment = new RecycieViewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam = getArguments().getString(ARG_PARAM1);
        }
    }



    private void initData() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        initData();
        View view = inflater.inflate(R.layout.fragment_recycie_view, container, false);
        RelativeLayout recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(container.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

//        recyclerView.setLayoutManager(manager);
//        recyclerView.addItemDecoration(new DividerItemDecoration(container.getContext(),DividerItemDecoration.HORIZONTAL.VERTICAL));
//
//        RecycieViewFragment adapter=new RecyclerViewAdapter(exercises);
//        recyclerView.setAdapter(adapter);
        return view;
    }
//    @Nullable
//    @Override
//    public ViewHolder onCreateViewHoder(@Nullable ViewGroup parent, int viewType){
//        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exercise,parent,false);
//        ViewHolder holder=new ViewHolder(view);
//        view.setOnClickListener(new View.OnClickListener(){
//           @Override
//           public void onCilck
//        });
//    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
