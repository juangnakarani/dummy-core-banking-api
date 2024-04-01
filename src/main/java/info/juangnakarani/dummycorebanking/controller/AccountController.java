package info.juangnakarani.dummycorebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("accounts")
    String showAccount(){
        return "Hi";
    }
}
