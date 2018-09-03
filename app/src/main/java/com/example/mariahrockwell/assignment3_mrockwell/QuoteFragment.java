package com.example.mariahrockwell.assignment3_mrockwell;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



public class QuoteFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    TextView textView;
    @Override
    //Creates drop-down selection menu to pick a quote.
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Spinner spinner = (Spinner) view.findViewById(R.id.quoteSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.quotes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        textView = (TextView) view.findViewById(R.id.quoteResult);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_checklist, container, false);
    }

    @Override
    //Gets String-Array from strings.xml and displays a quote depending
    //on which quote topic is selected.
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String dopeQuotes = parent.getItemAtPosition(position).toString();
        if (dopeQuotes.equals("Select")){
            textView.setText("Select a quote topic.");
        }
        else if (dopeQuotes.equals("Hope")){
            textView.setText("Hope is being able to see that there is light despite all of the darkness. -Desmond Tutu");
        }
        else if (dopeQuotes.equals("Leadership")){
            textView.setText("Innovation distinguishes between a leader and a follower. -Steve Jobs");
        }
        else if (dopeQuotes.equals("Kindness")){
            textView.setText("You can accomplish by kindess what you cannot by force. -Pubilius Syrus");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
