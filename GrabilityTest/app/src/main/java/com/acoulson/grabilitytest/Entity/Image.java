package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Image implements Serializable {
    @SerializedName("label")
    String url;
    @SerializedName("attributes")
    AtributesImage atributesImage;


    public String getUrl() {
        return url;
    }

    public AtributesImage getAtributesImage() {
        return atributesImage;
    }
}
