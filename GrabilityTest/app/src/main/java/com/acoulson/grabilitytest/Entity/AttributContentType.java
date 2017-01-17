package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class AttributContentType {
@SerializedName("term")
String term;
@SerializedName("label")
String nameAtributo;

public String getTerm() {
    return term;
}

public String getNameAtributo() {
    return nameAtributo;
}
}
