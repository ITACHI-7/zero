package com.zero.service;

import com.zero.models.commodity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CommodityService {

    public List<commodity> commodities=  Arrays.asList(new commodity("1","2","3",true,false),
                new commodity("4","5","6",true,false));

    public List<commodity> getAllCommodities() {
        return commodities;
    }

    public commodity getCommodity(final String id){
        return commodities.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

}
