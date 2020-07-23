package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "IT Quiz");

        String trules =
                " 1) There will be 2 participants per team.\n" +
                        " 2) Only one team per college can participate.\n" +
                        " 3) In IT-quiz there will be total of 6 rounds.\n" +
                        " 4) Each team will have to answer 2 questions per round. Team will be given 10 secs to answer a question.\n" +
                        " 5) Negative marks will be given for wrong answer.\n" +
                        " 6) Decision of the quizmaster will be considered as final.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz.this, QuizRegistration.class);
                startActivity(intent);
//                Toast.makeText(Quiz.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Quiz.this, AudiEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Quiz.this, AudiEvents.class);
        startActivity(intent);
    }
}