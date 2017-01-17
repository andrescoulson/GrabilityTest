package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class Image {
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
