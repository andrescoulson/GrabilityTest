package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AtributesReleaseDate implements Serializable {
    @SerializedName("label")
    String label;

    public String getLabel() {
        return label;
    }
}
