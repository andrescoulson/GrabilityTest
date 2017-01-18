package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Link implements Serializable {
@SerializedName("attributes")
AtributesLink atributesLink;

public AtributesLink getAtributesLink() {
    return atributesLink;
}
}
