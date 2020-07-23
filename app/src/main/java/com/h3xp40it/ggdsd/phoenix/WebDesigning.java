package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WebDesigning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_designing);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Web Designing");
        Button btn = findViewById(R.id.register);

        String trules =
                " • Application software (Notepad++, Photoshop, Wamp Server, Visual Studio)\n" +
                        " • Programming Language (Hypertext Markup Language (HTML), PHP, Java Script, ASP.Net.\n" +
                        " • Database with MySQL.";

        String wrules =
                " 1) Each college can have only one team of two members.\n" +
                        " 2) Participants need to design a 5+ pages website based on the competition topic.\n" +
                        " 3) Students have to design a web-site on the topic given on the spot.\n" +
                        " 4) First page must be your Homepage (Containing LOGO/picture depicting the topic and the website name).\n" +
                        " 5) Three pages must be dedicated to your discussion suitable for the website. \n" +
                        " 6) Use of USB drive is strictly prohibited.\n" +
                        " 7) Time given will be 90 minutes.";


        String mc =
                " • Innovation - 30%\n" +
                        " • Implementation - 20%\n" +
                        " • Design - 20% \n" +
                        " • Features - 20% \n" +
                        " • Future Scope - 10%";

        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        TextView txt2 = findViewById(R.id.wr);
        txt2.setText(wrules);

        TextView txt3 = findViewById(R.id.mc);
        txt3.setText(mc);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebDesigning.this, WebDesigningRegistration.class);
                startActivity(intent);
//                Toast.makeText(WebDesigning.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(WebDesigning.this, TechEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(WebDesigning.this, TechEvents.class);
        startActivity(intent);
    }
}
