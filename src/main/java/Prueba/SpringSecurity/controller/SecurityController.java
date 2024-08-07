package Prueba.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class SecurityController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World - not secured";
    }

    @GetMapping("/hello-secured")
    public String helloSecured(){
        return "Hello World - secured";
    }

    @GetMapping("/hello-authorized")
    public String helloAuthorized(){
        return "Hello World - authorized";
    }
}

