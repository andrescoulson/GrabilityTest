package com.acoulson.grabilitytest.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.acoulson.grabilitytest.R;
import com.acoulson.grabilitytest.adapters.CategoryRecyclerApdater;
import com.acoulson.grabilitytest.mvp.cateogry.CategoryPresenter;
import com.acoulson.grabilitytest.mvp.cateogry.ICategoryPresenter;
import com.acoulson.grabilitytest.mvp.cateogry.ICategoryView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CategoriesActivity extends AppCompatActivity implements ICategoryView {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;
    ICategoryPresenter iCategoryPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_categories);
        ButterKnife.bind(this);
        iCategoryPresenter = new CategoryPresenter(this,this);
    }

    @Override
    public void generarLinearLayout() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public CategoryRecyclerApdater crearAdapter(List<String> categorias) {
        return new CategoryRecyclerApdater(this, categorias);
    }

    @Override
    public void inicializarAdapter(CategoryRecyclerApdater apdater) {

        recyclerView.setAdapter(apdater);

    }
}
