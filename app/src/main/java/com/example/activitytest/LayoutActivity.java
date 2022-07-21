package com.example.activitytest;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;

import java.util.ArrayList;
import java.util.List;

public class LayoutActivity extends BaseActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    public String[] data = {"1", "2", "3", "4", "6", "5", "7", "8", "1", "2", "3", "4", "6", "5", "7", "8", "1", "2", "3", "4", "6", "5", "7", "8", "1", "2", "3", "4", "6", "5", "7", "8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_layout);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        initFruits();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(LayoutActivity.this, android.R.layout.simple_list_item_1, data);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
        FruitAdapter adapter = new FruitAdapter(LayoutActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(LayoutActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit apple2 = new Fruit("Apple2", R.drawable.ic_launcher_background);
            fruitList.add(apple2);
            Fruit apple3 = new Fruit("Apple3", R.drawable.ic_launcher_background);
            fruitList.add(apple3);
            Fruit apple4 = new Fruit("Apple4", R.drawable.ic_launcher_background);
            fruitList.add(apple4);
            Fruit apple5 = new Fruit("Apple5", R.drawable.ic_launcher_background);
            fruitList.add(apple5);
            Fruit apple6 = new Fruit("Apple6", R.drawable.ic_launcher_background);
            fruitList.add(apple6);
            Fruit apple7 = new Fruit("Apple7", R.drawable.ic_launcher_background);
            fruitList.add(apple7);

            Fruit apple8 = new Fruit("Apple8", R.drawable.ic_launcher_background);
            fruitList.add(apple8);

            Fruit apple9 = new Fruit("Apple9", R.drawable.ic_launcher_background);
            fruitList.add(apple9);
        }
    }
}