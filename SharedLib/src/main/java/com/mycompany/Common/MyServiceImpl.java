// En SharedLib, la implementación de MyService
package com.mycompany.Common;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public void execute() {
        System.out.println("Ejecutando el servicio...");
    }
}
