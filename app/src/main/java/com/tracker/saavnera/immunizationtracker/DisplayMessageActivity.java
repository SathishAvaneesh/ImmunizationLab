package com.tracker.saavnera.immunizationtracker;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_IMMUNIZATION = "com.tracker.saavnera.immunizationtracker.IMMUNIZATION";
    public String immunization;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        Integer Month = intent.getIntExtra("EXTRA_MESSAGE_MONTH", 01);
        Integer Year = intent.getIntExtra("EXTRA_MESSAGE_YEAR",2018);
        Integer Day = intent.getIntExtra("EXTRA_MESSAGE_DAY",01);
        Integer curYear = (Integer)Calendar.getInstance().get(Calendar.YEAR);
        Integer curMonth = (Integer)Calendar.getInstance().get(Calendar.MONTH);
        Integer curDay = (Integer)Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        View view1;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        final Button buttonView1;
        final Button buttonView2;
        final Button buttonView3;
        final Button buttonView4;
        final Button buttonView5;
        final Button buttonView6;
        int numMonthsTotal =  (12*(curYear - Year)) + (curMonth - Month);
        LinearLayout parentLayout = (LinearLayout)findViewById(R.id.layout);
        LayoutInflater layoutInflater = getLayoutInflater();
        if(numMonthsTotal == 0){
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view3 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            buttonView2 = (Button) view2.findViewById(R.id.button);
            buttonView3 = (Button) view3.findViewById(R.id.button);
            setButton("DPT (Diphtheria Pertussis Tetanus)", buttonView1);
            setButton("OPV", buttonView2);
            setButton("Hep-B 1", buttonView3);
            parentLayout.addView(buttonView1);
            parentLayout.addView(buttonView2);
            parentLayout.addView(buttonView3);
        }
        else if(numMonthsTotal == 1)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view3 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view4 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view5 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            buttonView2 = (Button) view2.findViewById(R.id.button);
            buttonView3 = (Button) view3.findViewById(R.id.button);
            buttonView4 = (Button) view4.findViewById(R.id.button);
            buttonView5 = (Button) view5.findViewById(R.id.button);

            setButton("BCG", buttonView1);
            setButton("OPV (Oral Polio Vaccine)", buttonView2);
            setButton("HiB", buttonView3);
            setButton("Pneumococcal", buttonView4);
            setButton("Hepatitis B", buttonView5);

            parentLayout.addView(buttonView1);
            parentLayout.addView(buttonView2);
            parentLayout.addView(buttonView3);
            parentLayout.addView(buttonView4);
            parentLayout.addView(buttonView5);
        }
        else if(numMonthsTotal == 2)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view3 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view4 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view5 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view6 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            buttonView2 = (Button) view2.findViewById(R.id.button);
            buttonView3 = (Button) view3.findViewById(R.id.button);
            buttonView4 = (Button) view4.findViewById(R.id.button);
            buttonView5 = (Button) view5.findViewById(R.id.button);
            buttonView6 = (Button) view6.findViewById(R.id.button);

            setButton("DPT", buttonView1);
            setButton("OPV", buttonView2);
            setButton("Hepatitis B", buttonView3);
            setButton("Pneumococcal", buttonView4);
            setButton("HiB", buttonView5);
            setButton("IPV (Inactivated Polio Vaccine)", buttonView5);

            parentLayout.addView(buttonView1);
            parentLayout.addView(buttonView2);
            parentLayout.addView(buttonView3);
            parentLayout.addView(buttonView4);
            parentLayout.addView(buttonView5);
            parentLayout.addView(buttonView6);
        }
        else if(numMonthsTotal == 3)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view3 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view4 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view5 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view6 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            buttonView2 = (Button) view2.findViewById(R.id.button);
            buttonView3 = (Button) view3.findViewById(R.id.button);
            buttonView4 = (Button) view4.findViewById(R.id.button);
            buttonView5 = (Button) view5.findViewById(R.id.button);
            buttonView6 = (Button) view6.findViewById(R.id.button);

            setButton("OPV", buttonView1);
            setButton("DPT (Diphtheria Pertussis Tetanus)", buttonView2);
            setButton("Hepatitis B", buttonView3);
            setButton("Pneumococcal", buttonView4);
            setButton("HiB", buttonView5);
            setButton("IPV (Inactivated Polio Vaccine)", buttonView5);

            parentLayout.addView(buttonView1);
            parentLayout.addView(buttonView2);
            parentLayout.addView(buttonView3);
            parentLayout.addView(buttonView4);
            parentLayout.addView(buttonView5);
            parentLayout.addView(buttonView6);
        }
        else if(3< numMonthsTotal && numMonthsTotal < 6)
        {
            notthereyet(6);
        }
        else if(6 == numMonthsTotal){
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            view3 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            buttonView2 = (Button) view2.findViewById(R.id.button);
            buttonView3 = (Button) view3.findViewById(R.id.button);
            setButton("Rotavirus", buttonView1);
            setButton("Influenza", buttonView2);
            setButton("HPV (Human Papilloma Virus", buttonView3);
            parentLayout.addView(buttonView1);
            parentLayout.addView(buttonView2);
            parentLayout.addView(buttonView3);
        }
        else if(6<numMonthsTotal && numMonthsTotal < 9)
        {
            notthereyet(9);
        }
        else if(numMonthsTotal == 9)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            setButton("Measles", buttonView1);
            parentLayout.addView(buttonView1);
        }
        else if(9<numMonthsTotal && numMonthsTotal < 12)
        {
            notthereyet(12);
        }
        else if(numMonthsTotal == 12)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            setButton("Varicella (Chickenpox)", buttonView1);
            parentLayout.addView(buttonView1);
        }
        else if(12<numMonthsTotal && numMonthsTotal < 15)
        {
            notthereyet(15);
        }
        else if(numMonthsTotal == 15)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            setButton("MMR (Measles, Mumps, Rubella)", buttonView1);
            parentLayout.addView(buttonView1);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView2 = (Button) view2.findViewById(R.id.button);
            setButton("Pneumococcal Booster", buttonView2);
            parentLayout.addView(buttonView2);
            view3 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView3 = (Button) view3.findViewById(R.id.button);
            setButton("IPV (Inactivated Polio Vaccine)", buttonView3);
            parentLayout.addView(buttonView3);
        }
        else if(15<numMonthsTotal && numMonthsTotal < 18)
        {
            notthereyet(18);
        }
        else if (numMonthsTotal == 18)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            setButton("OPV (Oral Polio Vaccine) Booster", buttonView1);
            parentLayout.addView(buttonView1);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView2 = (Button) view1.findViewById(R.id.button);
            setButton("DPT Booster", buttonView2);
            parentLayout.addView(buttonView2);
            view3 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView3 = (Button) view1.findViewById(R.id.button);
            setButton("HiB", buttonView3);
            parentLayout.addView(buttonView3);
            view4 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView4 = (Button) view1.findViewById(R.id.button);
            setButton("Hepatitis A", buttonView4);
            parentLayout.addView(buttonView4);
        }
        else if(18<numMonthsTotal && numMonthsTotal < 24)
        {
            notthereyet(24);
        }
        else if(numMonthsTotal == 24)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            setButton("Typhoid", buttonView1);
            parentLayout.addView(buttonView1);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView2 = (Button) view1.findViewById(R.id.button);
            setButton("Hepatitis A", buttonView2);
            parentLayout.addView(buttonView2);
        }
        else if(24<numMonthsTotal && numMonthsTotal < 48)
        {
            notthereyet(48);
        }
        else if(numMonthsTotal == 48)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            setButton("MMR(Measles, Mumps, Rubella", buttonView1);
            parentLayout.addView(buttonView1);
        }
        else if(48<numMonthsTotal && numMonthsTotal < 60)
        {
            notthereyet(60);
        }
        else if (numMonthsTotal == 60)
        {
            view1 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView1 = (Button) view1.findViewById(R.id.button);
            setButton("OPV (Oral Polio Vaccine) Booster", buttonView1);
            parentLayout.addView(buttonView1);
            view2 = layoutInflater.inflate(R.layout.button_layout, parentLayout, false);
            buttonView2 = (Button) view1.findViewById(R.id.button);
            setButton("DPT (Diphtheria Pertussis Tetanus) Booster", buttonView2);
            parentLayout.addView(buttonView2);
        }
        else if(60 < numMonthsTotal)
        {
            TextView textView = findViewById(R.id.notthereyet);
            textView.setText("We are sorry, our app only supports children from 0 Months to 60 Months ( 5 years) old. We are working on supporting more ages.");
        }
        notificationCall();
    }

    private void setButton(String text, final Button buttonView) {
        buttonView.setText(text);
        buttonView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                immunization = buttonView.getText().toString();
                goToDetail();
            }
        });
    }

    /** Called when the user taps the Send button */
    public void goToDetail() {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE_IMMUNIZATION, immunization);
        startActivity(intent);
    }
    public void notificationCall()
    {
        createNotificationChannel();
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "ImmunizationLab");
                mBuilder.setSmallIcon(R.drawable.ic_poison);
                mBuilder.setContentTitle("ImmunizationLab Notification");
                mBuilder.setContentText("You have a vaccination coming up. Set an appointment NOW");
                mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
                notificationManagerCompat.notify(001,mBuilder.build());
    }
    private void createNotificationChannel()
    {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            CharSequence name = "ImmunizationLab Notifications";
            String description = "Includes notifications to remind users of vaccination dates";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel("ImmunizationLab",name,importance);
            notificationChannel.setDescription(description);

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);

        }
    }
    public void notthereyet (int monthsLeft)
    {
        TextView textView = findViewById(R.id.notthereyet);
        textView.setText("Your next vaccination is when your child is " + monthsLeft + " months old. ");
    }
}