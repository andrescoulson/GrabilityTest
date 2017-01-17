package com.acoulson.grabilitytest.mvp.start;

import android.content.Context;
import android.util.Log;

import com.acoulson.grabilitytest.Entity.AppEntity;
import com.acoulson.grabilitytest.mvp.cateogry.ICategoryView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Andres on 16/01/2017.
 */

public class StartPresenter implements IStartPresenter {

    IStartView iStartView;
    Context context;
    String title;
    List<AppEntity> appEntities = new ArrayList<>();
    List<AppEntity> entityList = new ArrayList<>();

    public StartPresenter(IStartView iStartView, Context context, String title) {
        this.iStartView = iStartView;
        this.context = context;
        this.title = title;
        mostrarTitle();
        getListApps();
    }

    @Override
    public void getListApps() {
        AsyncHttpClient client = new AsyncHttpClient();

        client.get("https://itunes.apple.com/us/rss/topfreeapplications/limit=20/json", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                try {
                    JSONObject jsonObject = new JSONObject(new String(responseBody));
                    Type founderListType = new TypeToken<ArrayList<AppEntity>>() {
                    }.getType();
                    Gson gson = new Gson();
                    appEntities = gson.fromJson(jsonObject.getJSONObject("feed").getJSONArray("entry").toString(), founderListType);


                    for (AppEntity a : appEntities) {
                        if (a.getCategory().getAtributesCategory().getLabel().equals(title))
                            entityList.add(a);
                    }

                    mostrarCategoriasRV();
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

    @Override
    public void mostrarCategoriasRV() {
        iStartView.generarLinearLayout();
        iStartView.inicializarAdapter(iStartView.crearAdapter(entityList));
    }

    @Override
    public void mostrarTitle() {
        iStartView.showTitle(title);
    }
}
