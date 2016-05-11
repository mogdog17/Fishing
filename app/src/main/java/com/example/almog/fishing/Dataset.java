package com.example.almog.fishing;

import java.util.ArrayList;
import java.util.List;
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

/**
 * Created by Almog on 09/05/2016.
 */


public class Dataset {
    static List<String> TitleDB = new ArrayList<>();
    static List<String> DetilesDB = new ArrayList<>();
    static int i = 0;
    static int counter;

    public static void add(String value)
    {
        TitleDB.add(i, value);
    }

    public static void addToDialog(String value) {
        DetilesDB.add(i, value);
        i++;
        counter=i;
    }

    public static int GetI()
    {
        return counter;
    }


}

/*

    public static void add(String value)// functio static cous i static?
    {
        MeetingList Temp=new MeetingList();
        Temp->next=0;
        Temp.message=value;
        header-> next=Temp
        counterOfSets++;
    }
    class MeetingList
    {
        String Message;
        int *next;
    };
    static int counterOfSets = 0;
    MeetingList header=new MeetingList();

//        for (int j = 0; j < i; j++)
//        {
//            Dataset.add(i - j, MeetingsDB.get(i - j));// add meeting to mydataset
//        }
    }
*/