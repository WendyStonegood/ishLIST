package com.example.mariahrockwell.assignment3_mrockwell;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * I will be using JSON + SQL to send checked items from
 * the MainListFragment to this fragment. They will then
 * be able to check them when completed and upload a photo
 * to each item.
 */

public class MyListFragment extends Fragment {
    ListView lvMyItems;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvMyItems = (ListView) view.findViewById(R.id.lvMyItems);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_list, container, false);
    }


    public MyListFragment() {
        // Required empty public constructor
    }

}
