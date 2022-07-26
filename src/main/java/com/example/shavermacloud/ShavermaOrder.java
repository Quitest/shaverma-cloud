package com.example.shavermacloud;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShavermaOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryRegion;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Shaverma> shavermas = new ArrayList<>();

    public void addShaverma(Shaverma shaverma){
        shavermas.add(shaverma);
    }
}
