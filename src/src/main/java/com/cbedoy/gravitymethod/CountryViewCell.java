package com.cbedoy.gravitymethod;

import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Carlos on 10/05/2014.
 */
public class CountryViewCell extends BaseAdapter {

    private final Context context;

    public CountryViewCell(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            LayoutInflater inflate = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view  = inflate.inflate(position==0?R.layout.country_view_cell_title:R.layout.country_view_cell, null);

            convertView = view;
        }else {
            FrameLayout linearLayout = (FrameLayout)convertView;

            //HashMap<String, Object> information = (HashMap<String, Object>) dataModel.get(position);
            //TextView title                      = (TextView) linearLayout.findViewById(R.id.main_view_cell_title);
            //TextView value                      = (TextView) linearLayout.findViewById(R.id.main_view_cell_value);



        }
        return convertView;
    }
}
