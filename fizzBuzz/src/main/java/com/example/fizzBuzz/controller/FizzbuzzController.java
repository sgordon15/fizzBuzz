package com.example.fizzBuzz.controller;
import com.example.fizzBuzz.model.*;
import com.example.fizzBuzz.service.FizzbuzzService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/divisor")
public class FizzbuzzController {
    private final FizzbuzzService fizzbuzzService;
    @PostMapping("/Enter")
    public String enter(@RequestBody UserInput userInput)
    {
        return fizzbuzzService.enter(userInput);
    }

}
