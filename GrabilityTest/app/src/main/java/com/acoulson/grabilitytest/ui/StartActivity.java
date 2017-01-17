package com.acoulson.grabilitytest.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.acoulson.grabilitytest.Entity.AppEntity;
import com.acoulson.grabilitytest.R;
import com.acoulson.grabilitytest.adapters.ItemAppRecyclerAdapter;
import com.acoulson.grabilitytest.mvp.start.IStartPresenter;
import com.acoulson.grabilitytest.mvp.start.IStartView;
import com.acoulson.grabilitytest.mvp.start.StartPresenter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cz.msebera.android.httpclient.Header;

public class StartActivity extends AppCompatActivity implements IStartView {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    IStartPresenter startPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ButterKnife.bind(this);

        startPresenter = new StartPresenter(this, this, getIntent().getExtras().getString("categoria"));


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
    }

    @Override
    public void generarLinearLayout() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showTitle(String title) {

        toolbar.setTitle(title);
    }

    @Override
    public ItemAppRecyclerAdapter crearAdapter(List<AppEntity> appEntities) {
        return new ItemAppRecyclerAdapter(appEntities, this);
    }

    @Override
    public void inicializarAdapter(ItemAppRecyclerAdapter appRecyclerAdapter) {
        recyclerView.setAdapter(appRecyclerAdapter);
    }
}
