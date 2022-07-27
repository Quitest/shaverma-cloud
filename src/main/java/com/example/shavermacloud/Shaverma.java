package com.example.shavermacloud;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Shaverma {
    @NotNull
    @Size(min = 5, message = "Название должно быть не короче 5 символов")
    private String name;
    @NotNull
    @Size(min = 1, message = "Надо выбрать хотя бы один ингредиент")
    private List<Ingredient> ingredients;
}
