package com.example.mariahrockwell.assignment3_mrockwell;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import android.widget.TextView;
import android.view.View;
public class MyChildViewHolder extends ChildViewHolder {

    public TextView listChild;

    public MyChildViewHolder(View itemView) {
        super(itemView);
        listChild = (TextView) itemView.findViewById(R.id.listChild);

    }

    public void onBind(String Sousdoc) {
        listChild.setText(Sousdoc);

    }


}