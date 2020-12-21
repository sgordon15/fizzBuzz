package com.example.fizzBuzz.controller;
import com.example.fizzBuzz.model.*;
import com.example.fizzBuzz.service.FizzbuzzService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/divisor")
public class FizzbuzzController {
    private final FizzbuzzService fizzbuzzService;
    @GetMapping("/Enter/{userInput}")
    public String enter(@PathVariable Integer userInput)
    {
        return fizzbuzzService.enter(userInput);
    }

}
