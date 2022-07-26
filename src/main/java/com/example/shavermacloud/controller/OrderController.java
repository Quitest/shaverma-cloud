package com.example.shavermacloud.controller;

import com.example.shavermacloud.ShavermaOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("shavermaOrder")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(){
        return "orderForm";
    }

    @PostMapping/*("/orders")*/
    public String processOrder(@Valid ShavermaOrder order, Errors errors, SessionStatus sessionStatus){
        if (errors.hasErrors()){
            return "orderForm";
        }
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
