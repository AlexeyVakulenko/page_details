package com.example.a16680399.myapplication;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Вакуленко Алексей
 */
public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private Context context;

    public Adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup recicler, int i) {
        LayoutInflater inflater = LayoutInflater.from(recicler.getContext());
        return new Holder(inflater.inflate(R.layout.item, recicler, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        switch (i) {
            case 0:
                holder.bind((context.getString(R.string.head_1)),context.getString(R.string.content_1),
                        R.drawable.ic_action_message);
                break;
            case 1:
                holder.bind((context.getString(R.string.head_2)),context.getString(R.string.content_2),
                        R.drawable.ic_info);
                break;
            case 2:
                holder.bind((context.getString(R.string.head_3)),context.getString(R.string.content_3),
                        R.drawable.ic_time);
                break;
            default:
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class Holder extends RecyclerView.ViewHolder {

        private TextView textView1;

        private TextView textView2;

        private ImageView imageView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.item_text_view_1);
            textView2 = itemView.findViewById(R.id.item_text_view_2);
            imageView = itemView.findViewById(R.id.imageView2);
        }

        public void bind(String head, String content, int image) {
            textView1.setText(head);
            textView2.setText(content);
            imageView.setImageResource(image);
        }
    }
}
