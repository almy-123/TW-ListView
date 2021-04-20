package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> module;
    private Context context;
    private TextView tvModuleName;
    private ImageView ivModuleIcon;
    
    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        this.context = context;
        module = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvModuleName = (TextView) rowView.findViewById(R.id.tvModName);
        ivModuleIcon = (ImageView) rowView.findViewById(R.id.ivProg);
        
        //Module currentMod = Module.get(position);

        Module currentMod = module.get(position);
        tvModuleName.setText(currentMod.getModName());

        if(currentMod.isIcon()) {
            ivModuleIcon.setImageResource(R.drawable.prog);
        } else {
            ivModuleIcon.setImageResource(R.drawable.nonprog);
        }

        return rowView;
    }
}
