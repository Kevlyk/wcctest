package com.wcc.javatest.javatest.service.impl;

import com.wcc.javatest.javatest.controller.entities.GetDistanceBetweenPostcodesResponse;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngRequest;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngResponse;
import com.wcc.javatest.javatest.dao.PostcodeLatLngDao;
import com.wcc.javatest.javatest.pojo.PostcodeLatLng;
import com.wcc.javatest.javatest.service.*;
import com.wcc.javatest.javatest.util.MathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostcodeServiceImpl implements PostcodeService {


    @Autowired
    private PostcodeLatLngDao postcodeDao;

    @Override
    public GetDistanceBetweenPostcodesResponse getDistance(String postcodeA, String postcodeB) {
        PostcodeLatLng postcodeLatLngA = postcodeDao.getPostcode(postcodeA);
        PostcodeLatLng postcodeLatLngB = postcodeDao.getPostcode(postcodeB);
        Double distance = MathUtil.calculateDistance(postcodeLatLngA.latitude,postcodeLatLngA.longitude,postcodeLatLngB.latitude,postcodeLatLngB.longitude);

        return new GetDistanceBetweenPostcodesResponse(postcodeLatLngA,postcodeLatLngB,distance);
    }

    @Override
    public SetPostcodeLatLngResponse setPostcodeLatLng(SetPostcodeLatLngRequest request) {
        return new SetPostcodeLatLngResponse(postcodeDao.setPostCodeLatLng(request));
    }
}
