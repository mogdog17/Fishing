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
    static int i = 0;
    private String title;
    private String details;
    private Dataset dataset;

    public Dataset(String title, String details) {
        this.title = title;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public void setDataset(Dataset ) {
        this.dataset = dataset;
    }

    public Dataset getDataset()
    {
        return dataset;
    }


}

