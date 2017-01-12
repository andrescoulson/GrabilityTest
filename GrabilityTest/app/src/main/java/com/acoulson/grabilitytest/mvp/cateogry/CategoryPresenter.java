package com.acoulson.grabilitytest.mvp.cateogry;

import android.content.Context;
import android.util.Log;

import com.acoulson.grabilitytest.Entity.AppEntity;
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
 * Created by acoulson on 11/01/17.
 */

public class CategoryPresenter implements ICategoryPresenter {

    ICategoryView iCategoryView;
    Context context;
    List<AppEntity> appEntities;
    List<String> categoryLis = new ArrayList<String>();

    public CategoryPresenter(ICategoryView iCategoryView, Context context) {
        this.iCategoryView = iCategoryView;
        this.context = context;
    }

    @Override
    public void getListCategory() {
        AsyncHttpClient client = new AsyncHttpClient();

        client.get("https://itunes.apple.com/us/rss/topfreeapplications/limit=20/json", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                try {
                    JSONObject jsonObject = new JSONObject(new String(responseBody));
                    Type founderListType = new TypeToken<ArrayList<AppEntity>>() {
                    }.getType();

                    Gson gson = new Gson();
                    Log.e("Entry", jsonObject.getJSONObject("feed").getJSONArray("entry").toString());
                    appEntities = gson.fromJson(jsonObject.getJSONObject("feed").getJSONArray("entry").toString(), founderListType);


                    for (AppEntity a : appEntities) {
                        boolean esta = false;
                        for (String s : categoryLis) {

                            if (s.equals(a.getCategory())) {
                                esta = true;
                                break;
                            }
                        }

                        if (!esta)
                            categoryLis.add(a.getCategory());
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

    @Override
    public void mostrarCategoriasRV() {
        iCategoryView.inicializarAdapter(iCategoryView.crearAdapter(categoryLis));
    }
}
