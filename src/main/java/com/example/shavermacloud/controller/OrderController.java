package com.example.shavermacloud.controller;

import com.example.shavermacloud.ShavermaOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("shavermaOrder")
public class OrderController {

    @GetMapping("/curent")
    public String orderForm(){
        return "orderForm";
    }

    @PostMapping("/orders")
    public String processOrder(ShavermaOrder order, SessionStatus sessionStatus){
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}