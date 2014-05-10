package com.cbedoy.gravitymethod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Carlos on 10/05/2014.
 */
public class ViewCellItem extends BaseAdapter{

    Context         context;
    List<Object>    dataModel;

    public ViewCellItem(Context context, List<Object> dataModel){
        this.context    = context;
        this.dataModel  = dataModel;
    }

    @Override
    public int getCount() {
        return dataModel.size();
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
            View view  = inflate.inflate(R.layout.main_view_cell, null);
            convertView = view;
        }else {
            LinearLayout linearLayout = (LinearLayout)convertView;

            HashMap<String, Object> information = (HashMap<String, Object>) dataModel.get(position);
            TextView title                      = (TextView) linearLayout.findViewById(R.id.main_view_cell_title);
            TextView value                      = (TextView) linearLayout.findViewById(R.id.main_view_cell_value);



        }


        return null;
    }
}
