package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class ThongTinAdapter extends RecyclerView.Adapter<ThongTinAdapter.ThongTinHolder> {
    private Context context;
    private List<ThongTin> array;
    public ThongTinAdapter(Context context, List<ThongTin> array) {
        this.context = context;
        this.array = array;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ThongTinHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new ThongTinHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThongTinHolder holder, int position) {
        ThongTin tt = array.get(position);
        holder.textViewten.setText(tt.getName());
        holder.textViewlop.setText(tt.getDetail());
        holder.imageView.setImageResource(tt.getImg());
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity2.class);
                intent.putExtra("tt",tt);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public class ThongTinHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textViewten, textViewlop;
        private ImageView imageView;
        private LinearLayout item;
        public ThongTinHolder(@NonNull View itemView) {
            super(itemView);
            textViewten = itemView.findViewById(R.id.tv_name);
            textViewlop = itemView.findViewById(R.id.tv_class);
            imageView = itemView.findViewById(R.id.img);
            item = itemView.findViewById(R.id.item);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {


        }
    }
}


