package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Id implements Serializable {
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
