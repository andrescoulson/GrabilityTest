package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AtributesLink implements Serializable {
@SerializedName("rel")
String rel;
@SerializedName("type")
String tipe;
@SerializedName("href")
String href;

public String getRel() {
    return rel;
}

public String getTipe() {
    return tipe;
}

public String getHref() {
    return href;
}
}
