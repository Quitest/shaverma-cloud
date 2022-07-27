package com.example.shavermacloud;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
public class ShavermaOrder {
    @NotBlank(message = "Поле необходимо заполнить")
    private String deliveryName;
    @NotBlank(message = "Поле необходимо заполнить")
    private String deliveryStreet;
    @NotBlank(message = "Поле необходимо заполнить")
    private String deliveryCity;
    @NotBlank(message = "Поле необходимо заполнить")
    private String deliveryRegion;
    @NotBlank(message = "Поле необходимо заполнить")
    private String deliveryZip;
//    @CreditCardNumber(message = "Номе карты некорректный")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Неправильный CVV")
    private String ccCVV;

    private List<Shaverma> shavermas = new ArrayList<>();

    public void addShaverma(Shaverma shaverma) {
        shavermas.add(shaverma);
    }
}
