package com.example.shavermacloud;

import lombok.Data;

import java.util.List;

@Data
public class Shaverma {
    private String name;
    private List<Ingredient> ingredients;
}
