package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rights implements Serializable {
@SerializedName("label")
String rights;

public String getRights() {
    return rights;
}
}
