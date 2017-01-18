package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AtributesArtist implements Serializable {
@SerializedName("href")
String href;

public String getHref() {
    return href;
}
}
