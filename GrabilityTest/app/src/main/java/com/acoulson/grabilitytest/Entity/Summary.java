package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class Summary {
@SerializedName("label")
String summary;

public String getSummary() {
    return summary;
}
}
