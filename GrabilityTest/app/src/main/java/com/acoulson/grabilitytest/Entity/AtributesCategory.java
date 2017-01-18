package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AtributesCategory implements Serializable {

@SerializedName("im:id")
String id;
@SerializedName("term")
String term;
@SerializedName("scheme")
String scheme;
@SerializedName("label")
String label;

public String getId() {
    return id;
}

public String getTerm() {
    return term;
}

public String getScheme() {
    return scheme;
}

public String getLabel() {
    return label;
}
}
