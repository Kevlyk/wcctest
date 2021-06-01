package com.wcc.javatest.javatest.service;

import com.wcc.javatest.javatest.controller.entities.GetDistanceBetweenPostcodesResponse;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngRequest;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngResponse;

public interface PostcodeService {
    public abstract GetDistanceBetweenPostcodesResponse getDistance(String postcodeA, String postcodeB);
    public abstract SetPostcodeLatLngResponse setPostcodeLatLng(SetPostcodeLatLngRequest request);

}
