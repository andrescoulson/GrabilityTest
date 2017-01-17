package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class ReleaseDate {
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
