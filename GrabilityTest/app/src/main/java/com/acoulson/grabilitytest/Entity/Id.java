package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class Id {
@SerializedName("label")
String label;
@SerializedName("attributes")
AtributesId atributesId;

public String getLabel() {
    return label;
}

public AtributesId getAtributesId() {
    return atributesId;
}
}
