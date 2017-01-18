package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Category implements Serializable {
@SerializedName("attributes")
AtributesCategory atributesCategory;

public AtributesCategory getAtributesCategory() {
    return atributesCategory;
}
}
