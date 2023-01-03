package com.yigitb.foodapp.data.entity;

import com.google.gson.annotations.SerializedName;

public class CRUDCevap {
    @SerializedName("success")
    private int success;
    @SerializedName("message")
    private String message;


    public CRUDCevap() {
    }


    public CRUDCevap(String message, int succes) {
        this.message = message;
        this.success = succes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSucces() {
        return success;
    }

    public void setSucces(int succes) {
        this.success = succes;
    }
}
