package com.h3xp40it.ggdsd.phoenix;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

import de.cketti.mailto.EmailIntentBuilder;


public class AdMadShowRegistration extends AppCompatActivity {

    Button btnGenerateOTP, btnSignIn;
    EditText etPhoneNumber, etOTP;
    String phoneNumber, otp;
    FirebaseAuth auth;
    PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallback;
    private String verificationCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_mad_show_registration);
        enterotpdisable();
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Ad Mad Show Registartion");
        registerDisable();
        findViews();
        StartFirebaseLogin();


        findViewById(R.id.btn_generate_otp).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (haveNetworkConnection()) {
                    EditText college = findViewById(R.id.collegeEditBox);
                    EditText oneContestant = findViewById(R.id.contestantOne);
                    EditText twoContestant = findViewById(R.id.contestantTwo);
                    EditText threeContestant = findViewById(R.id.contestantThree);
                    EditText fourContestant = findViewById(R.id.contestantFour);
                    EditText fiveContestant = findViewById(R.id.contestantFive);
                    EditText contact = findViewById(R.id.et_phone_number);
                    if (isEmpty(college) || isEmpty(oneContestant) || isEmpty(twoContestant) || isEmpty(threeContestant) || isEmpty(fourContestant) || isEmpty(fiveContestant) || isEmpty(contact)) {
                        if (isEmpty(college)) {
                            Toast.makeText(AdMadShowRegistration.this, "Please enter college name", Toast.LENGTH_SHORT).show();
                        } else if (isEmpty(oneContestant) || isEmpty(twoContestant) || isEmpty(threeContestant) || isEmpty(fourContestant) || isEmpty(fiveContestant)) {
                            Toast.makeText(AdMadShowRegistration.this, "Please enter 5 names", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(AdMadShowRegistration.this, "Please enter contact number", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        phoneNumber = "+91" + etPhoneNumber.getText().toString();
                        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                                phoneNumber,                     // Phone number to verify
                                60,                           // Timeout duration
                                TimeUnit.SECONDS,                // Unit of timeout
                                AdMadShowRegistration.this,         // Activity (for callback binding)
                                mCallback);
                    }
                } else
                    Toast.makeText(AdMadShowRegistration.this, "Please connect to the internet", Toast.LENGTH_SHORT).show();

            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(etOTP)) {
                    Toast.makeText(AdMadShowRegistration.this, "Please enter OTP", Toast.LENGTH_SHORT).show();
                } else {
                    otp = etOTP.getText().toString();
                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationCode, otp);
                    SigninWithPhone(credential);
                }
            }
        });
    }


    private void SigninWithPhone(PhoneAuthCredential credential) {
        auth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            EditText college = findViewById(R.id.collegeEditBox);
                            EditText oneContestant = findViewById(R.id.contestantOne);
                            EditText twoContestant = findViewById(R.id.contestantTwo);
                            EditText threeContestant = findViewById(R.id.contestantThree);
                            EditText fourContestant = findViewById(R.id.contestantFour);
                            EditText fiveContestant = findViewById(R.id.contestantFive);
                            EditText contact = findViewById(R.id.et_phone_number);
                            String subject = "Ad Mad Show";
                            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "hiteshchopra525@gmail.com", null));


                            String message = "College" + "\n" + college.getText().toString() + "\n\n" +
                                    "Contestants" + "\n" +
                                    "1." + oneContestant.getText().toString() + "\n" +
                                    "2." + twoContestant.getText().toString() + "\n" +
                                    "3." + threeContestant.getText().toString() + "\n" +
                                    "4." + fourContestant.getText().toString() + "\n" +
                                    "5." + fiveContestant.getText().toString() + "\n\n" +
                                    "Contact Number" + "\n" + contact.getText().toString() + "\n";

                            EmailIntentBuilder.from(AdMadShowRegistration.this)
                                    .to("hiteshchopra11@gmail.com")
                                    .subject(subject)
                                    .body(message)
                                    .start();

                        } else if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                            Toast.makeText(AdMadShowRegistration.this, "You have entered an incorrect OTP", Toast.LENGTH_SHORT).show();


                        }
                    }
                });
    }


    private void findViews() {


        btnGenerateOTP = findViewById(R.id.btn_generate_otp);
        btnSignIn = findViewById(R.id.btn_sign_in);
        etPhoneNumber = findViewById(R.id.et_phone_number);
        etOTP = findViewById(R.id.et_otp);
    }

    private void StartFirebaseLogin() {

        auth = FirebaseAuth.getInstance();
        mCallback = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential credential) {
                enterotpdisable();
                registerDisable();
                EditText college = findViewById(R.id.collegeEditBox);
                EditText oneContestant = findViewById(R.id.contestantOne);
                EditText twoContestant = findViewById(R.id.contestantTwo);
                EditText threeContestant = findViewById(R.id.contestantThree);
                EditText fourContestant = findViewById(R.id.contestantFour);
                EditText fiveContestant = findViewById(R.id.contestantFive);
                EditText contact = findViewById(R.id.et_phone_number);
                Toast.makeText(AdMadShowRegistration.this, "OTP verified", Toast.LENGTH_SHORT).show();
                String subject = "Ad Mad Show";
                final Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "hiteshchopra525@gmail.com", null));
                String message = "College" + "\n" + college.getText().toString() + "\n\n" +
                        "Contestants" + "\n" +
                        "1." + oneContestant.getText().toString() + "\n" +
                        "2." + twoContestant.getText().toString() + "\n" +
                        "3." + threeContestant.getText().toString() + "\n" +
                        "4." + fourContestant.getText().toString() + "\n" +
                        "5." + fiveContestant.getText().toString() + "\n\n" +
                        "Contact Number" + "\n" + contact.getText().toString() + "\n";

                EmailIntentBuilder.from(AdMadShowRegistration.this)
                        .to("hiteshchopra11@gmail.com")
                        .subject(subject)
                        .body(message)
                        .start();
            }

            @Override
            public void onVerificationFailed(FirebaseException e) {

                //Toast.makeText(AdMadShowRegistration.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                String tmp = "Some error occured.";

                if (tmp.contains("TOO_SHORT")) {
                    Toast.makeText(AdMadShowRegistration.this, "The number entered is too short.", Toast.LENGTH_SHORT).show();
                }

                else if (tmp.contains("TOO_LONG")) {
                    Toast.makeText(AdMadShowRegistration.this, "The number entered is too long.", Toast.LENGTH_SHORT).show();
                }

                else if (tmp.contains("Invalid format")) {
                    Toast.makeText(AdMadShowRegistration.this, "Invalid format", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(AdMadShowRegistration.this, tmp, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken
                    forceResendingToken) {
                enterotpenable();
                registerEnable();
                super.onCodeSent(s, forceResendingToken);
                verificationCode = s;
                Toast.makeText(AdMadShowRegistration.this, "Code sent", Toast.LENGTH_SHORT).show();
            }
        };


    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() <= 0;
    }

    public void back(View view) {
        Intent intent = new Intent(AdMadShowRegistration.this, AdMadShow.class);
        startActivity(intent);
    }

    public void enterotpdisable() {
        findViewById(R.id.et_otp).setVisibility(View.GONE);
    }

    public void enterotpenable() {
        findViewById(R.id.et_otp).setVisibility(View.VISIBLE);
    }

    public void registerEnable() {
        findViewById(R.id.btn_sign_in).setVisibility(View.VISIBLE);
    }

    public void registerDisable() {
        findViewById(R.id.btn_sign_in).setVisibility(View.GONE);
    }

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AdMadShowRegistration.this, AdMadShow.class);
        startActivity(intent);
    }
}
