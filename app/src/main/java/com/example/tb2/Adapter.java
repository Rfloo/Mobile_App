package com.example.tb2;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<String> abcd;
    List<Integer> abcdImage;
    List<String> abcdShow;
    List<String> abcdStatus;
    LayoutInflater inflater;

    public Adapter (Context ctx, List<String> abcd, List<Integer> abcdImage, List<String> abcdShow, List<String> abcdStatus) {

        this.abcd = abcd;
        this.abcdImage = abcdImage;
        this.abcdStatus = abcdStatus;
        this.abcdShow = abcdShow;
        this.inflater = LayoutInflater.from(ctx);

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_item_member, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.abcd.setText(abcd.get(position));
        holder.abcdImage.setImageResource(abcdImage.get(position));
        holder.abcdStatus.setText(abcdStatus.get(position));
        holder.abcdShow.setText(abcdShow.get(position));

    }

    @Override
    public int getItemCount() {
        return abcd.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView abcd;
        ImageView abcdImage;
        TextView abcdStatus;
        TextView abcdShow;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            abcd = itemView.findViewById(R.id.textVieww);
            abcdImage = itemView.findViewById(R.id.imagevieww);
            abcdShow = itemView.findViewById(R.id.showTeater);
            abcdStatus = itemView.findViewById(R.id.Status);
        }
    }
}
