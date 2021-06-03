package com.personal.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRec extends RecyclerView.Adapter<AdapterRec.proViewHolder> {
    String arr[];
    int img[];
    Context context;


    //same name -no return
    public  AdapterRec(String[] arr, int[] img,Context context){
        this.arr=arr;
        this.img=img;
        this.context=context;
    }
    @NonNull
    @Override
    public proViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.custom_row,parent,false);
        return new proViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull proViewHolder holder, int position) {
        String name=arr[position];
        int imageView=img[position];
        holder.tv.setText(name);
        holder.iv.setImageResource(imageView);
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    class proViewHolder extends RecyclerView.ViewHolder{
            ImageView iv;
            TextView tv;
        public proViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.btn);
        }
    }

}
