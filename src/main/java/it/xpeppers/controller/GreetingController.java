package it.xpeppers.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

  @RequestMapping("/")
  public String greeting() {
    return "Hello World!";
  }
}