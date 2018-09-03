package com.example.mariahrockwell.assignment3_mrockwell;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class GishResponse {
    private String itemNo;
    private String points;
    private String itemDesc;

    public GishResponse() {
    }

    public GishResponse(String itemNo, String points, String itemDesc) {
        this.itemNo = itemNo;
        this.points = points;
        this.itemDesc = itemDesc;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}