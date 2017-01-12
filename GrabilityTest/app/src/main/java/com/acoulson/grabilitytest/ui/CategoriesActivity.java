package com.acoulson.grabilitytest.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.acoulson.grabilitytest.R;
import com.acoulson.grabilitytest.adapters.CategoryRecyclerApdater;
import com.acoulson.grabilitytest.mvp.cateogry.ICategoryView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

public class CategoriesActivity extends AppCompatActivity implements ICategoryView {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    @Override
    public void generarLinearLayout() {

    }

    @Override
    public CategoryRecyclerApdater crearAdapter(List<String> categorias) {
        return new CategoryRecyclerApdater(this,categorias);
    }

    @Override
    public void inicializarAdapter(CategoryRecyclerApdater apdater) {

        recyclerView.setAdapter(apdater);

    }
}
