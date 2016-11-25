package com.acoulson.grabilitytest.config;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by acoulson on 27/04/16.
 */
public class MyPreferenceManager {


    private String TAG = MyPreferenceManager.class.getSimpleName();

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    private static final String KEY_CATEGORIES = "LCategories";
    private static final String KEY_APPS = "LApps";

    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "Grability";


    public MyPreferenceManager(Context _context) {
        this._context = _context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void StoreApps(AppsJson usuario) {
        editor.putString(KEY_CATEGORIES, usuario.getCategorias());
        editor.putString(KEY_APPS, usuario.getApps());
        editor.commit();
    }

    public AppsJson getUser() {
        if (pref.getString(KEY_APPS, null) != null) {
            String apps, categoires;
            apps = pref.getString(KEY_APPS, null);
            categoires = pref.getString(KEY_CATEGORIES, null);

            AppsJson user = new AppsJson(categoires, apps);
            return user;
        }
        return null;
    }

    public void clear(){

        editor.clear();
        editor.commit();

    }

}
