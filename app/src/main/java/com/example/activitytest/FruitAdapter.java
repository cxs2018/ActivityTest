package com.example.activitytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView fruitView;
        public TextView fruitName;

        public MyViewHolder(View view) {
            super(view);
            fruitView = (ImageView) view.findViewById(R.id.fruit_image);
            fruitName= (TextView) view.findViewById(R.id.fruit_name);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position); // 获取当前项的Fruit实例
        View view;
        MyViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new MyViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (MyViewHolder) view.getTag();
        }
        viewHolder.fruitView.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }
}
