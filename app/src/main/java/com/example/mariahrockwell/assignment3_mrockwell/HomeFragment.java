package com.example.mariahrockwell.assignment3_mrockwell;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.support.v7.app.ActionBar;


public class HomeFragment extends Fragment implements View.OnClickListener{

    @Override
    //Sets up button and listener to display on home page
    //and display QuoteFragment, Calendar, MainListFragment,
    // MyListFragment, and Notes when pressed.
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button gish = (Button) getView().findViewById(R.id.btnGish);
        gish.setOnClickListener(this);
        Button btnCalendar = (Button) getView().findViewById(R.id.btnCalendar);
        btnCalendar.setOnClickListener(this);
        Button btnNotes = (Button) getView().findViewById(R.id.btnNotes);
        btnNotes.setOnClickListener(this);
        Button btnProducts = (Button) getView().findViewById(R.id.btnProducts);
        btnProducts.setOnClickListener(this);
        Button btnProductList = (Button) getView().findViewById(R.id.btnProductList);
        btnProductList.setOnClickListener(this);
        Button btnTeammates = (Button) view.findViewById(R.id.btnTeammates);
        btnTeammates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getActivity(), TeamMates.class);
                startActivity(myintent);
            }
        });
    }

    //displays the HomeFragment on screen
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

//moves to the corresponding fragment when button is pressed
    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.btnGish:
                fragment = new QuoteFragment();
                break;
            case R.id.btnCalendar:
                fragment = new Calendar();
                break;
            case R.id.btnNotes:
                fragment = new Notes();
                break;
            case R.id.btnProducts:
                fragment = new GishListFragment();
                break;
            case R.id.btnProductList:
                fragment = new MyListFragment();
                break;
        }
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment)
                .addToBackStack(null)
                .commit();
    }
}
