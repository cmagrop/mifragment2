package com.example.mifragment2.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mifragment2.Fragments.DetailsFragment;
import com.example.mifragment2.Models.Mail;
import com.example.mifragment2.R;

public class DetailsActivity extends AppCompatActivity {


    private String subject;
    private String message;
    private String sender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        if (getIntent().getExtras() != null) {
            subject = getIntent().getStringExtra("subject");
            message = getIntent().getStringExtra("message");
            sender = getIntent().getStringExtra("senderName");
        }

        Mail mail = new Mail(subject, message, sender);

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
        detailsFragment.renderMail(mail);

    }
}
