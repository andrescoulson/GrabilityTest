package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class Title {
@SerializedName("label")
String title;

public String getTitle() {
    return title;
}

}
