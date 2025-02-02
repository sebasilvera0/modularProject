package com.mycompany.controller;

import com.mycompany.Common.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void executeService() {
        System.out.println("Invocando el servicio...");
        myService.execute();
    }
}
