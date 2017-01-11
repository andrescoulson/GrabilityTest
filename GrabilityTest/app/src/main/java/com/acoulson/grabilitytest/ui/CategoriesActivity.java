package com.acoulson.grabilitytest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.acoulson.grabilitytest.R;
import com.acoulson.grabilitytest.mvp.cateogry.ICategoryView;

public class CategoriesActivity extends AppCompatActivity implements ICategoryView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }
}
