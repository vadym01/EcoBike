package com.DAO;

import com.ecoBike.EBike;

import java.util.ArrayList;
import java.util.List;

public class EBikeData {

    List<EBike> eBikeList = new ArrayList<>();

    public void seteBikeList(EBike bike) {
        eBikeList.add(bike);
    }

    public void getAll(){
        eBikeList.forEach(System.out::println);
    }

}
