package com.example.almog.fishing;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
public class Meetings extends AppCompatActivity
{
    ListView listView ;
    final Context context = this;
    private ArrayList<Dataset> dataset;
    private Dataset meetset;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meetings);

        meetset= meetset.getDataset(); // recieved informtion from the intent, my idea, working on it

        //dataset = (ArrayList<Dataset>) intent.getSerializableExtra("dataset");
        listView = (ListView) findViewById(R.id.list);

        ArrayList<String> titles = new ArrayList<>();
        ArrayAdapter<Dataset> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                dataset);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
            //id: The row id of the item that was clicked.
            //position-int: The position of the view in the adapter.
            //parent-: The AdapterView where the click happened.

            final ListView MyListView=(ListView)findViewById(R.id.list);
            final Dialog dialog = new Dialog(context);
            TextView[] textViewArray = new TextView[MyListView.getLastVisiblePosition()];
            TextView  text = (TextView) dialog.findViewById(R.id.textViewDetiled);// define textview of detiled window

            dialog.setContentView(R.layout.custom);// connect the detiled layout with the dialog
            text.setText(dataset.get(position).getDetails());//any click!!  set text in the textview of the detiled window
            dialog.show();
           //int itemPosition = position;
          // String itemValue = (String)listView.getItemAtPosition(M.getLastVisiblePosition());
            }
        });

    }
}

