package com.example.a16680399.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author Вакуленко Алексей
 */
public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    public Adapter(Context context) {

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup recicler, int i) {
        LayoutInflater inflater = LayoutInflater.from(recicler.getContext());
        return new Holder(inflater.inflate(R.layout.item, recicler, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.bind("test" + i);
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class Holder extends RecyclerView.ViewHolder {

        private TextView textView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item_text_view);
        }

        public void bind(String text) {
            textView.setText(text);
        }
    }
}
