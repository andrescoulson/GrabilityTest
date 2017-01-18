package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Title implements Serializable {
@SerializedName("label")
String title;

public String getTitle() {
    return title;
}

}
