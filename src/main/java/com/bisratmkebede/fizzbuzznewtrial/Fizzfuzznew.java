package com.bisratmkebede.fizzbuzznewtrial;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Fizzfuzznew {
    @RequestMapping
    public String BisratNewM (){

        String ans = "";
            for(int count = 1; count < 101; count++) {
                if(count % 3 == 0 && count % 5 == 0) ans = "FizzBuzz ";
                else if(count % 3 == 0) ans = "Fizz " ;
                else if(count % 5 == 0) ans =  "Buzz ";
                else ans = String.valueOf(count);
                System.out.println(ans);
            }
            return   ans ;
            }
}
