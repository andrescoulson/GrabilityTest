package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Price implements Serializable {
@SerializedName("label")
String price;
@SerializedName("attributes")
PriceAtributos priceAtributos;

public String getPrice() {
    return price;
}

public PriceAtributos getPriceAtributos() {
    return priceAtributos;
}
}
