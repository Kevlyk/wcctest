package com.wcc.javatest.javatest.controller.entities;

import com.wcc.javatest.javatest.pojo.PostcodeLatLng;

public class GetDistanceBetweenPostcodesResponse {
    public PostcodeLatLng postcodeLatLngA;
    public PostcodeLatLng postcodeLatLngB;
    public Double distance;
    public String unit = "km";

    public GetDistanceBetweenPostcodesResponse(PostcodeLatLng postcodeLatLngA, PostcodeLatLng postcodeLatLngB, Double distance) {
        this.postcodeLatLngA=postcodeLatLngA;
        this.postcodeLatLngB=postcodeLatLngB;
        this.distance=distance;
    }
}
