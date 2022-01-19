package com.example.landmarkdenemesi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.landmarkdenemesi.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    ArrayList<Landmark> landmarkArrayList;
    public LandmarkAdapter(ArrayList<Landmark> landmarkArrayList){
        this.landmarkArrayList=landmarkArrayList;
    }

    //her bir satır için hazırlanan recycler_row yapısının adaptere bağladık
    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.recyclerRowBinding.recyclerViewTextView.setText(landmarkArrayList.get(position).model);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(),DetailsActivity.class);
                //intent.putExtra("landmark",landmarkArrayList.get(position));
                Singleton singleton=Singleton.getInstance();
                singleton.setSentLandmark(landmarkArrayList.get(position))02,+5
                        ;
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding recyclerRowBinding;

        public LandmarkHolder(@NonNull RecyclerRowBinding recyclerRowBinding) {
            super(recyclerRowBinding.getRoot());
            this.recyclerRowBinding=recyclerRowBinding;
        }
    }
}
