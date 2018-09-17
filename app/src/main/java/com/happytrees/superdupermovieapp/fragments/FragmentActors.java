package com.happytrees.superdupermovieapp.fragments;


import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.happytrees.superdupermovieapp.R;
import com.happytrees.superdupermovieapp.ViewModels.SearchViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentActors extends Fragment {


    public FragmentActors() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_actors, container, false);
        Log.e("lifecycle","FragmentActors onCreateView" );
        TextView tv = v.findViewById(R.id.actorsTV);

     /*   SearchViewModel tvModel = ViewModelProviders.of(getActivity()).get(SearchViewModel.class);//create association between this activity and ViewModel.
        tvModel.searchQuery.observe(this, o -> tv.setText(o.toString()));//observe changes in searchQuery live data */

        return v;


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("lifecycle","FragmentActors onAttach" );
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("lifecycle","FragmentActors onCreate" );
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("lifecycle","FragmentActors onActivityCreated" );
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("lifecycle","FragmentActors onStart" );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("lifecycle","FragmentActors onResume" );
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("lifecycle","FragmentActors onPause" );
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("lifecycle","FragmentActors onStop" );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("lifecycle","FragmentActors onDestroyView" );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle","FragmentActors onDestroy" );
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("lifecycle","FragmentActors onDetach" );
    }


}
