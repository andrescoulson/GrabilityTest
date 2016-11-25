package com.acoulson.grabilitytest.config;

/**
 * Created by acoulson on 27/04/16.
 */
public class AppsJson {

    String categorias,apps;

    public AppsJson(String categorias, String apps) {
        this.categorias = categorias;
        this.apps = apps;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getApps() {
        return apps;
    }

    public void setApps(String apps) {
        this.apps = apps;
    }
}
