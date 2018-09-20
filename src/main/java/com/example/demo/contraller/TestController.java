package com.example.demo.contraller;

import com.example.demo.service.T1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "t")
public class TestController {

    private T1Service t1Service;

    @Autowired
    public TestController(T1Service t1Service) {
        this.t1Service = t1Service;
    }

    @GetMapping(value = "a")
    public String t(){
        t1Service.run();
        return "aa";
    }

    @GetMapping(value = "b")
    public String tb(){
        t1Service.run2();
        return "aa";
    }

}
