package com.example.mariahrockwell.assignment3_mrockwell;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by csa on 3/7/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHoder>{

    List<GishListModel> list;
    Context context;

    public RecyclerAdapter(List<GishListModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.gish_list_items,parent,false);
        MyHoder myHoder = new MyHoder(view);


        return myHoder;
    }

    @Override
    public void onBindViewHolder(MyHoder holder, int position) {
        GishListModel mylist = list.get(position);
        holder.itemno.setText(mylist.getitemno());
        holder.points.setText(mylist.getpoints());
        holder.itemDesc.setText(mylist.getitemDesc());
    }

    @Override
    public int getItemCount() {

        int arr = 0;

        try{
            if(list.size()==0){

                arr = 0;

            }
            else{

                arr=list.size();
            }



        }catch (Exception e){



        }

        return arr;

    }

    class MyHoder extends RecyclerView.ViewHolder{
        TextView itemno, points, itemDesc;


        public MyHoder(View itemView) {
            super(itemView);
           // itemno = (TextView) itemView.findViewById(R.id.vname);
           // points= (TextView) itemView.findViewById(R.id.vemail);
           // itemDesc= (TextView) itemView.findViewById(R.id.vaddress);

        }
    }

}