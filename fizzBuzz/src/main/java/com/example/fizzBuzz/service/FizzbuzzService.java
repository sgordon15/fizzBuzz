package com.example.fizzBuzz.service;
import com.example.fizzBuzz.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FizzbuzzService {

    public String enter(Integer userInput) {
        if(userInput % 5 ==0 && userInput % 3 ==0) {
            return ("fizzbuzz");
        }
            if(userInput % 5==0 && userInput %3 !=0){
                return ("fizz");
            }
            if(userInput % 5 !=0 && userInput %3==0){
                return ("buzz");
            }
            return ("This number is not divisible by 5 and 3. ");
    }
}
