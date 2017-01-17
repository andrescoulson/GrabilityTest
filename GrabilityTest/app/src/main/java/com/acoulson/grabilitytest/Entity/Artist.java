package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class Artist {
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
