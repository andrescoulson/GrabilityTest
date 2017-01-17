package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class Name {
@SerializedName("label")
String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
}
