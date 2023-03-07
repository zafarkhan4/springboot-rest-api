package com.techreturners.apilab1.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techreturners.apilab1.model.Coffee;

@RestController
public class CoffeeController {
  
  private final AtomicLong counter = new AtomicLong();
  
  @GetMapping(value = "/coffeelover")
  public String coffeeLover(){
    return "I like coffee!";
  }

  @GetMapping(value = "/coffee")
  public Coffee coffee(@RequestParam(name="name", defaultValue="latte") String name){
    return new Coffee(counter.incrementAndGet(), name);
  }
  
}
