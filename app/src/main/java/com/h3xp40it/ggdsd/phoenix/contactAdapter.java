package com.h3xp40it.ggdsd.phoenix;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class contactAdapter extends ArrayAdapter<Contactlist> {

    contactAdapter(Activity context, ArrayList<Contactlist> wordList) {
        super(context, 0, wordList);
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        Contactlist words = getItem(position);
        words = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        assert words != null;
        name.setText(words.getName());

        TextView number = listItemView.findViewById(R.id.number);
        number.setText(words.getNumber());

        ImageView img = listItemView.findViewById(R.id.image);
        img.setImageResource(words.getImg());

        return listItemView;
    }

}
