package com.wcc.javatest.javatest.dao;

import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngRequest;
import com.wcc.javatest.javatest.pojo.PostcodeLatLng;

public interface PostcodeLatLngDao {
    public abstract PostcodeLatLng getPostcode(String postcode);

    public abstract boolean setPostCodeLatLng(SetPostcodeLatLngRequest request);
}
