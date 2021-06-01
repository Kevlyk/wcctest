package com.wcc.javatest.javatest.controller;

import com.wcc.javatest.javatest.controller.entities.GetDistanceBetweenPostcodesRequest;
import com.wcc.javatest.javatest.controller.entities.GetDistanceBetweenPostcodesResponse;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngRequest;
import com.wcc.javatest.javatest.controller.entities.SetPostcodeLatLngResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/postcode")
interface PostcodeApi {

    @ApiOperation(value = "postcode", tags = "Postcode")
    @GetMapping("/getDistanceBetweenPostcodes")
    GetDistanceBetweenPostcodesResponse getDistanceBetweenPostcodes(@RequestBody GetDistanceBetweenPostcodesRequest request);

    @ApiOperation(value = "postcode", tags = "Postcode")
    @PostMapping("/setPostcodeLatLng")
    SetPostcodeLatLngResponse setPostcodeLatLng(@RequestBody SetPostcodeLatLngRequest request);
}