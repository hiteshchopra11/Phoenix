package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ItPresentation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_presentation);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "IT Presentation");

        String trules =
                " 1) Only one participant from each institute/college is allowed.\n" +
                        " 2) The participant will be given 7 minutes to present their IT based topic. The warning bell will ring at end of 5th minute and then final bell at 7th minute.\n" +
                        " 3) Questioning will be done for 1 minute.\n" +
                        " 4) The presentation should be in MS PowerPoint. Projector will be provided along with computer. No need to bring laptops. Carry your presentation in a CD/ Pen drive.\n" +
                        " 5) No responsibility for infected pen drives. The candidate has to make their own arrangement.\n" +
                        " 6) The exhaustive list of topics for presentation are:\n" +
                        "      a) GiFi\n" +
                        "      b) No-Sql databases\n" +
                        "      c) Ai and robotics\n" +
                        "      d) Dark web\n" +
                        "      e) SEO (Search engine\n" +
                        "         optimization)\n" +
                        "      f) Xml encryption\n" +
                        "      g) Hadoop";


        String wrules =
                " • Topic coverage\n" +
                        " • Body Language\n" +
                        " • Way of expression\n" +
                        " • Ability to answer to questioning";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        TextView txt2 = findViewById(R.id.wr);
        txt2.setText(wrules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItPresentation.this, ItPresentationRegistration.class);
                startActivity(intent);
//                Toast.makeText(ItPresentation.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(ItPresentation.this, TechEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ItPresentation.this, TechEvents.class);
        startActivity(intent);
    }
}