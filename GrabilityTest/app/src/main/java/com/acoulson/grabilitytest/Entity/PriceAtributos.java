package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PriceAtributos implements Serializable {
@SerializedName("amount")
String amount;
@SerializedName("currency")
String currency;

public String getAmount() {
    return amount;
}

public String getCurrency() {
    return currency;
}
}
