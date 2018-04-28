package com.cmpe277.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cmpe277.R;
import com.cmpe277.ui.api.UIItemService;
import com.cmpe277.vo.Item;

import java.util.List;
import java.util.Map;

public class ItemActivity extends Activity implements UIItemService{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
    }



    @Override
    public void displayAllItems(List<Item> items) {

    }
}
