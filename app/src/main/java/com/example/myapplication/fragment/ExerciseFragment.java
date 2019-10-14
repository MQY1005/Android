package com.example.myapplication.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.entity.Exercise;
import com.example.myapplication.utils.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ExerciseFragment extends Fragment {

    private static final String ARG_PARAM1 = "param";

    private String mParam;

    private OnFragmentInteractionListener mListener;

    private ArrayList<Exercise> exercise;
    private ListView lvExecise;

    public ExerciseFragment() {
        // Required empty public constructor
    }


    public static ExerciseFragment newInstance(String param) {
        ExerciseFragment fragment = new ExerciseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1,param);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam = getArguments().getString(ARG_PARAM1);
        }
    }
    String[] data={"软件1721","软件1711","软件1731"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_blank, container, false);
       initData();
       lvExecise=view.findViewById(R.id.List_view);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_2,data);
        lvExecise.setAdapter(adapter);
        return view;
    }

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
    private void initData(){
        exercise=new ArrayList<>();
        try{
            InputStream input =getResources().getAssets().open("exercise_title.json");
//            String json=IOUtils.convert(json,Exercise.class);
      //      exercise = IOUtils.convert(json,Exercise.class);
        }catch (IOException e){
            e.printStackTrace();

        }

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void setToolbarTitle(String title);

        void onFragmentInteraction(Uri uri);
    }
}
