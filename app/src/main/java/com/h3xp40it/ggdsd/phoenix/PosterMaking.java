package com.h3xp40it.ggdsd.phoenix;

        import android.content.Intent;
        import android.os.Bundle;

        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;


public class PosterMaking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poster_making);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Poster Making");

        String trules =
                " 1) Blank sheets will be provided to each participant.\n" +
                        " 2) Topic for poster making will be given on the spot.\n" +
                        " 3) Participants are required to bring materials like pencil color, paint, etc.\n" +
                        " 4) Time limit for the event is 60 minutes.\n" +
                        " 5) Participants should reach the venue 15 minutes prior to the commencement of the event.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PosterMaking.this, PosterMakingRegistration.class);
                startActivity(intent);
//                Toast.makeText(PosterMaking.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(PosterMaking.this, NonTechEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(PosterMaking.this, NonTechEvents.class);
        startActivity(intent);
    }
}