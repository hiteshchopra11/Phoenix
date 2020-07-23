package com.h3xp40it.ggdsd.phoenix;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.UUID;

public class About extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "About Us");

        String uniqueID = UUID.randomUUID().toString();
        Log.e("Unique ID:", uniqueID);
        TextView ap = findViewById(R.id.ap);

        String about_phoenix = "Phoenix is an imaginary bird in ancient stories" + "" +
                " that lives for 500 years before it burns itself to death and then " +
                "is born again from its ashes. It is a symbol of rebirth, immortality " +
                "and reprise.\n\nAnd so analogously, Phoenix is a technical-cultural event " +
                "hosted by IT department of GGDSD College every year to entice students " +
                "from various colleges to come and showcase their talent and perfection" +
                "in a myriad of competitions.\n\nPhoenix 2018 was a big eminent achievement " +
                "of GGDSD College which garnered hoard of students from a number of " +
                "colleges and was hallowed on everyone's lips and words.\n";

        ap.setText("" + about_phoenix);

    }

    public void back(View view) {
        Intent intent = new Intent(About.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(About.this, MainActivity.class);
        startActivity(intent);
    }
}
