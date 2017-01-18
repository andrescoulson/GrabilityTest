package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AtributesImage implements Serializable {
@SerializedName("height")
String height;

public String getHeight() {
    return height;
}
}
