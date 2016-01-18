package com.example.tacademy.sampleautocompletetextview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-01-18.
 */
public class MyAdapter extends BaseAdapter implements Filterable{
    List<MyData> originalItems = new ArrayList<MyData>();
    List<MyData> items = null;
    @Override
    public int getCount() {
        if(items == null) return 0;
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemVIew view;
        if(convertView != null){
            view = (ItemVIew)convertView;
        }
        else{
            view = new ItemVIew(parent.getContext());
        }
        view.setData(items.get(position));

        return view;
    }

    Filter filter;

    @Override
    public Filter getFilter() {
        return null;
    }
}
