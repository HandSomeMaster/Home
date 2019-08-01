package com.process.bwy.study.animation.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.process.bwy.study.R;

import java.util.List;

public class ViewAnimationAdapter extends RecyclerView.Adapter<ViewAnimationAdapter.ViewHolder> {
    private Context context;
    private List<String> been;

    public ViewAnimationAdapter(Context context, List<String> been) {
        this.context = context;
        this.been = been;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view_animation,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.textView.setText(been.get(i));
    }

    @Override
    public int getItemCount() {
        return been.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item_view_animation_tv);
        }
    }

}
