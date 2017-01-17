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



    public void clear(){

        editor.clear();
        editor.commit();

    }

}
