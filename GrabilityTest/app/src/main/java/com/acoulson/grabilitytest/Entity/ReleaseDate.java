package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ReleaseDate implements Serializable {
@SerializedName("label")
String label;
@SerializedName("attributes")
AtributesReleaseDate date;

public String getLabel() {
    return label;
}

public AtributesReleaseDate getDate() {
    return date;
}
}
