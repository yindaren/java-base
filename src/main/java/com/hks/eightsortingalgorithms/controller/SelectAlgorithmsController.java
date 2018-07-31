package com.hks.eightsortingalgorithms.controller;

import com.hks.eightsortingalgorithms.method.SelectAlgorithms;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "选择排序")
public class SelectAlgorithmsController {

    @Autowired
    SelectAlgorithms selectAlgorithms;

    @RequestMapping(value = "/selectSorting", method = RequestMethod.POST)
    @ApiOperation("选择排序")
    public int[] selectSorting(@RequestParam int[] intArr) {
        return selectAlgorithms.sort(intArr);
    }

}