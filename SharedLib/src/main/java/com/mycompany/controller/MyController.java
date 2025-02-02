package com.mycompany.controller;

import com.mycompany.common.MyService;
import java.util.ServiceLoader;

public class MyController {
    private MyService myService;

    public MyController() {
        // Cargar la implementación de MyService dinámicamente
        ServiceLoader<MyService> loader = ServiceLoader.load(MyService.class);
        myService = loader.findFirst().orElseThrow(() -> new RuntimeException("No se encontró un servicio MyService"));
    }

    public void doSomething() {
        System.out.println("Controlador ejecutando servicio...");
        myService.execute(); // Llamar a la implementación oculta de MyService
    }
}
