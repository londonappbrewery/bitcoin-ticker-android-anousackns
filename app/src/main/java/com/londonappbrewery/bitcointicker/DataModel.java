package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class DataModel {

    private String bPrice;

    public static DataModel fromJson(JSONObject jsonObject){
        try {
            DataModel price = new DataModel();
            price.bPrice = jsonObject.getString("ask");
            return price;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getPrice() {
        return bPrice;
    }
}
