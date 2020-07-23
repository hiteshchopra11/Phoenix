package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Contact");

        final ArrayList<Contactlist> contacts = new ArrayList<>();
        contacts.add(new Contactlist(R.drawable.verifiedcontact, "Shailja Agnihotri", "+91 9988008459"));

        contactAdapter adapter = new contactAdapter(this, contacts);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+91 9988008459"));
                    startActivity(intent);
                }
            }
        });

        final ArrayList<Contactlist> contacts1 = new ArrayList<>();
        //contacts1.add(new Contactlist(R.drawable.verifiedcontact, "Ankit Vohra", "+91 7307742795"));
        contacts1.add(new Contactlist(R.drawable.verifiedcontact, "Anurag Rawal", "+91 9915428322"));
        //contacts1.add(new Contactlist(R.drawable.verifiedcontact, "Anuj Kaushik", "+91 7087019048"));


        contactAdapter adapter1 = new contactAdapter(this, contacts1);
        ListView listView1 = findViewById(R.id.listView1);
        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+91 9915428322"));
                    startActivity(intent);
                }
                /*if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+91 9915428322"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+91 7087019048"));
                    startActivity(intent);
                }*/
            }
        });

        final ArrayList<Contactlist> contacts2 = new ArrayList<>();
        contacts2.add(new Contactlist(R.drawable.ytt, "YouTube", "@IT Fest - Phoenix"));

        contactAdapter adapter2 = new contactAdapter(this, contacts2);
        ListView listView2 = findViewById(R.id.listView2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCVX7Hxt35vf6IXUJ07onBag"));
                    startActivity(browserIntent);
                }
            }
        });

        final ArrayList<Contactlist> contacts3 = new ArrayList<>();
        contacts3.add(new Contactlist(R.drawable.instaa, "Instagram", "@phoenixggdsd"));
        contactAdapter adapter3 = new contactAdapter(this, contacts3);
        ListView listView3 = findViewById(R.id.listView3);
        listView3.setAdapter(adapter3);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/phoenixggdsd/?utm_source=ig_profile_share&igshid=tnvpl8t6y7ia"));
                    startActivity(browserIntent);
                }
            }
        });


        final ArrayList<Contactlist> contacts4 = new ArrayList<>();
        contacts4.add(new Contactlist(R.drawable.fbb, "Facebook", "@phoenixggdsd"));


        contactAdapter adapter4 = new contactAdapter(this, contacts4);
        ListView listView4 = findViewById(R.id.listView4);
        listView4.setAdapter(adapter4);
        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/phoenixggdsd"));
                    startActivity(browserIntent);
                }
            }
        });

    }

    public void back(View view) {
        Intent intent = new Intent(Contact.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Contact.this, MainActivity.class);
        startActivity(intent);
    }
}
