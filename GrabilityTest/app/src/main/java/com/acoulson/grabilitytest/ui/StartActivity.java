package com.acoulson.grabilitytest.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.acoulson.grabilitytest.Entity.AppEntity;
import com.acoulson.grabilitytest.R;
import com.acoulson.grabilitytest.adapters.ItemAppRecyclerAdapter;
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

public class StartActivity extends AppCompatActivity {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAppRecyclerAdapter(this));
        recyclerView.setHasFixedSize(true);


        getApps();

    }

    private void getApps() {

        AsyncHttpClient client = new AsyncHttpClient();

        client.get("https://itunes.apple.com/us/rss/topfreeapplications/limit=20/json", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                try {
                    JSONObject jsonObject = new JSONObject(new String(responseBody));
                    Type founderListType = new TypeToken<ArrayList<AppEntity>>(){}.getType();

                    Gson gson = new Gson();
                    Log.e("Entry", jsonObject.getJSONObject("feed").getJSONArray("entry").toString());
                    List<AppEntity> appEntities = gson.fromJson(jsonObject.getJSONObject("feed").getJSONArray("entry").toString(), founderListType);


                    for (AppEntity a : appEntities) {

                        Log.e("name", a.getName());
                        Log.e("rights", a.getRights());
                        Log.e("title", a.getTitle());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                Log.e("JSON", new String(responseBody));
            }
        });
    }

}