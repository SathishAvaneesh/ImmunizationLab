package com.tracker.saavnera.immunizationtracker;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_AGE = "com.tracker.saavnera.immunizationtracker.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DatePicker datePicker = (DatePicker)findViewById(R.id.Datepick);
        final Button buttonDateSet = (Button)findViewById(R.id.set);
        final Intent intent = new Intent(this, DisplayMessageActivity.class);


        buttonDateSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int dateMonth =  datePicker.getMonth();
                final int dateYear = datePicker.getYear();
                final int dateDay = datePicker.getDayOfMonth();
                //final String finalDate = dateMonth.toString() + " " + dateYear.toString();
                intent.putExtra("EXTRA_MESSAGE_MONTH", dateMonth);
                intent.putExtra("EXTRA_MESSAGE_YEAR", dateYear);
                intent.putExtra("EXTRA_MESSAGE_DAY", dateDay);

                startActivity(intent);
            }
        });

    }

    public void notificationCall()
    {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "ImmunizationLab")
                .setSmallIcon(R.drawable.notification)
                .setContentTitle("ImmunizationLab Notification")
                .setContentText("You have an immunization coming up!")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1,mBuilder.build());
    }


    /** Called when the user taps the Send button */



}
