package com.manishkpr.menudrawerexample;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class SlidingNavAdapter extends BaseAdapter {
	List<SlidingGetSet> data;
	Context context;
    public SlidingNavAdapter(List<SlidingGetSet> data,Context context){
    	this.data=data;
    	this.context=context;
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int id) {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public long getItemId(int id) {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater layoutInflater = LayoutInflater.from(this.context);
		ViewHolder viewHolder;

		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.sliding_nav_items, null);
			//## Initial Views
			viewHolder.navText=(TextView)convertView.findViewById(R.id.navText);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		//## Setup Data below
		viewHolder = (ViewHolder) convertView.getTag();
	    TextView navText=viewHolder.navText;
	    
	    
	    navText.setText(data.get(position).getName());
	    
		return convertView;
	}
	
	public class ViewHolder {
        TextView navText;
	}

}