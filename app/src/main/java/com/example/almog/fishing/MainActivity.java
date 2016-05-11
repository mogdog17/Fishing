package com.example.almog.fishing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity
{

    ArrayList<Dataset> dataset = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name=(EditText)findViewById(R.id.Name);
        final EditText Area=(EditText)findViewById(R.id.Area);
        final Spinner Style=(Spinner)findViewById(R.id.spinner);
        Button SendButton=(Button)findViewById(R.id.SendButton);
        final EditText MeetingString=(EditText)findViewById(R.id.Dialog);
        final Intent intent = new Intent(this,Meetings.class);


        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateFormat dayFormat = new SimpleDateFormat("dd.MM.yyyy, HH:mm");
                String timeNow = dayFormat.format(Calendar.getInstance().getTime());
                String title = name.getText().toString() + " מעוניין לצאת לדוג באיזור " + Area.getText().toString() + " בשיטת דייג " + Style.getSelectedItem().toString() + " ." + " פורסם ב:" + " " + timeNow;

                dataset.add(new Dataset(title, MeetingString.getText().toString()));
                intent.putExtra("dataset", (Serializable) dataset);
                startActivity(intent);
            }
        });
    }






//   public void onClickPost(View view)
//    {
//       Button SendButton = (Button) findViewById(R.id.meetingButton);
//       EditText textFill= (EditText)findViewById(R.id.meetingEdit);
//       Intent I= new Intent(this, Meetings.class);
//       I.putExtra("MyKey",textFill.getText().toString());
//       startActivity(I);
//   }
}




