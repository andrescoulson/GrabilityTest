package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ContentType implements Serializable {
@SerializedName("attributes")
AttributContentType attributContentType;

public AttributContentType getAttributContentType() {
    return attributContentType;
}
}
