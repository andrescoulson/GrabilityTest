package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

public class Price {
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
