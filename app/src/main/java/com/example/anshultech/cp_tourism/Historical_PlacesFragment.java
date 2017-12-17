package com.example.anshultech.cp_tourism;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Historical_PlacesFragment extends Fragment {


    public Historical_PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Jantar Mantar", "Sansad Marg,Connaught Place", R.drawable.ic_place_white_36dp));



        wordAdapter itemsAdapter = new wordAdapter(getActivity(), words, R.color.colorhistorical);
        ListView listview = (ListView) rootView.findViewById(R.id.CP_listview);
        listview.setAdapter(itemsAdapter);
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                word wordClassVariable = words.get(i);
//
//            }
//
//        });

        return rootView;
    }

}
