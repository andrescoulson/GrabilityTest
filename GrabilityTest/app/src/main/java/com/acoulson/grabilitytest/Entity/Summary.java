package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Summary implements Serializable {
@SerializedName("label")
String summary;

public String getSummary() {
    return summary;
}
}
