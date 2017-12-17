package com.example.anshultech.cp_tourism;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AnshulTech on 18-Dec-17.
 */

public class wordAdapter extends ArrayAdapter<word> {

    private int mColorResourceID;

    public wordAdapter(Activity Context, ArrayList<word> word, int colorResourceID) {
        super(Context, 0, word);
        mColorResourceID= colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitemview = convertView;
        if(listitemview == null){
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }
        word getcurrentword = getItem(position);

        TextView nametext = (TextView) listitemview.findViewById(R.id.listitemname);
        nametext.setText(getcurrentword.getmName());

        TextView detailstext = (TextView) listitemview.findViewById(R.id.listitedetails);
        detailstext.setText(getcurrentword.getmDetails());

        ImageView listimageitemview = (ImageView) listitemview.findViewById(R.id.listviewimage);
        if(getcurrentword.hasImage()) {

            listimageitemview.setImageResource(getcurrentword.getmImageResourceID());
            listimageitemview.setVisibility(View.VISIBLE);
        }
        else{
            listimageitemview.setVisibility(View.GONE);
        }

        View textContainer = listitemview.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);

        return listitemview;

    }
}
