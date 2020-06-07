package com.DAO;

import com.ecoBike.Speedelec;

import java.util.ArrayList;
import java.util.List;

public class SpeedelecData {

    List<Speedelec> speedelecList = new ArrayList<>();

    public void setSpeedelecList(Speedelec speedelec){
        speedelecList.add(speedelec);
    }

    public void getAll(){
        speedelecList.forEach(System.out::println);
    }
}
