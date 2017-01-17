package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class ContentType {
@SerializedName("attributes")
AttributContentType attributContentType;

public AttributContentType getAttributContentType() {
    return attributContentType;
}
}
