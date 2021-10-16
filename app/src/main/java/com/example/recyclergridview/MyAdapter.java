package com.example.recyclergridview;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    String[] companyList;
    Bitmap[] logoList;

    public MyAdapter(String[] companyList, Bitmap[] logoList) {
        this.companyList = companyList;
        this.logoList = logoList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.logo.setImageBitmap(logoList[position]);
        holder.logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        holder.name.setText(companyList[position]);
    }

    @Override
    public int getItemCount() {
        return companyList.length;
    }
}