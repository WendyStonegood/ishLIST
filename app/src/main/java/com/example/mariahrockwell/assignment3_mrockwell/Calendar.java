package com.example.mariahrockwell.assignment3_mrockwell;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;


public class Calendar extends Fragment {

    /**
     * I will be adding ways to add, edit, delete, and remind to the calendar.
     */

    //declaring calendar view
    CalendarView calendarView;

    //creating view
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        calendarView = (CalendarView) view.findViewById(R.id.calendarView);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }

    public Calendar() {
        // Required empty public constructor
    }

}
