package com.wcc.javatest.javatest.pojo;

public class PostcodeLatLng {
    public String postcode;
    public Double latitude;
    public Double longitude;

    public PostcodeLatLng(String postcode,double latitude,double longitude){
        this.postcode=postcode;
        this.latitude=latitude;
        this.longitude=longitude;
    }
}
