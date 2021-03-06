package com.zero.controller;

import com.zero.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zero.models.commodity;

import java.util.Arrays;
import java.util.List;

@RestController
public class commodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(method = RequestMethod.GET ,value ="/commodity")
    public List<commodity> getAllCommodities(){

        return commodityService.getAllCommodities();
    }
    @RequestMapping(value = "/commodity/{id}")
    public commodity getById(@PathVariable String id){

        return commodityService.getCommodity(id);
    }
}
