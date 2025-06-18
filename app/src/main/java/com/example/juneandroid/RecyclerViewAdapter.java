package com.example.juneandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<CompanyInfData> companyInfDataList;

    public RecyclerViewAdapter(List<CompanyInfData> companyInfDataList) {
        this.companyInfDataList = companyInfDataList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.rv_list_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
            holder.tvheading.setText(companyInfDataList.get(position).getName());
            holder.tvdes.setText(companyInfDataList.get(position).getDesc());
           // holder.ivimg.setImageResource(companyInfDataList.get(position).getImgId());
    }

    @Override
    public int getItemCount() {
        return companyInfDataList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivimg;
        public TextView tvheading;
        public TextView tvdes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivimg=itemView.findViewById(R.id.ivimg);
            tvheading=itemView.findViewById(R.id.tvheading);
            tvdes=itemView.findViewById(R.id.tvdes);
        }
    }
}
