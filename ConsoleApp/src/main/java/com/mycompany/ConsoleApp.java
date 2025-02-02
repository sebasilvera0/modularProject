/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany;

import com.mycompany.Common.CommounUtility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mycompany.Common.MyService;



/**
 *
 * @author sebas
 */
public class ConsoleApp {

    
    public static void main(String[] args) {
        String appName = CommounUtility.getAppName();
        
        ApplicationContext context = new AnnotationConfigApplicationContext("com.mycompany");
        
        MyService myService = context.getBean(MyService.class);

        myService.execute();
        
        miClase obj = new miClase();
        
    }
}
