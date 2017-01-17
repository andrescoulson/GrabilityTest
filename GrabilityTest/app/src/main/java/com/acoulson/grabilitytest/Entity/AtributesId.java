package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class AtributesId {
@SerializedName("im:id")
String id;
@SerializedName("im:bundleId")
String bundleId;

public String getId() {
    return id;
}

public String getBundleId() {
    return bundleId;
}
}
