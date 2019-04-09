package com.prasad.findhome.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prasad.findhome.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

public class HintAdapter extends RecyclerView.Adapter<HintAdapter.HintViewHolder> {
    private Context context;
    public HintAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public HintViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hint_show,parent,false);
        return new HintViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HintViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class HintViewHolder extends RecyclerView.ViewHolder{

        public HintViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
