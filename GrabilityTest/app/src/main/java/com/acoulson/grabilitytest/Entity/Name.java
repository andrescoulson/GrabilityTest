package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Name implements Serializable {
@SerializedName("label")
String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
}
