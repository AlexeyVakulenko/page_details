package com.example.a16680399.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
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
        holder.bind("Очень важный проверочный текст. Очень важный проверочный текст. Очень важный проверочный текст 1" + i, "Очень важный проверочный текст. Очень важный проверочный текст. Очень важный проверочный текст 2" + i);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class Holder extends RecyclerView.ViewHolder {

        private TextView textView1;

        private TextView textView2;

        public Holder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.item_text_view_1);
            textView2 = itemView.findViewById(R.id.item_text_view_2);
        }

        public void bind(String text1, String text2) {
            textView1.setText(text1);
            textView2.setText(text2);
        }
    }
}
