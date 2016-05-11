package com.example.almog.fishing;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class Meetings extends AppCompatActivity
{

    ListView listView ;
    final Context context = this;
    static int i=0;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meetings);

        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                Dataset.TitleDB);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {//id: The row id of the item that was clicked.
//position-int: The position of the view in the adapter.
//parent-: The AdapterView where the click happened.
                final ListView MyListView=(ListView)findViewById(R.id.list);
                final Dialog dialog = new Dialog(context);
                TextView[] textViewArray = new TextView[MyListView.getLastVisiblePosition()];
                //TextView  text = (TextView) dialog.findViewById(R.id.textViewDetiled);// define textview of detiled window
                dialog.setContentView(R.layout.custom);// connect the detiled layout with the dialog
                textViewArray[i].setText(Dataset.DetilesDB.get(    );//any click!!  set text in the textview of the detiled window
                dialog.show();
               //int itemPosition = position;
              // String itemValue = (String)listView.getItemAtPosition(M.getLastVisiblePosition());
            }
        });

    }
}

