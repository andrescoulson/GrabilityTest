package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Artist implements Serializable {
@SerializedName("label")
String label;
@SerializedName("attributes")
AtributesArtist atributesArtist;

public String getLabel() {
    return label;
}

public AtributesArtist getAtributesArtist() {
    return atributesArtist;
}
}
