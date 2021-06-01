package com.wcc.javatest.javatest.controller;

import com.wcc.javatest.javatest.controller.entities.GetDistanceBetweenPostcodesRequest;
import com.wcc.javatest.javatest.controller.entities.GetDistanceBetweenPostcodesResponse;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngRequest;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngResponse;
import com.wcc.javatest.javatest.service.PostcodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/postcode")
public class PostcodeController implements PostcodeApi {
    @Autowired
    PostcodeService postcodeService;

    Logger logger = LoggerFactory.getLogger(PostcodeController.class);


    @GetMapping("/getDistanceBetweenPostcodes")
    @Override
    public GetDistanceBetweenPostcodesResponse getDistanceBetweenPostcodes(@RequestBody GetDistanceBetweenPostcodesRequest request) {
        logger.info("[getDistanceBetweenPostcodes] : postcodeA :" + request.postcodeA + "," + "postcodeB :" + request.postcodeB);
        return postcodeService.getDistance(request.postcodeA, request.postcodeB);
    }

    @PostMapping("/setPostcodeLatLng")
    @Override
    public SetPostcodeLatLngResponse setPostcodeLatLng(SetPostcodeLatLngRequest request) {
        return postcodeService.setPostcodeLatLng(request);
    }

}
