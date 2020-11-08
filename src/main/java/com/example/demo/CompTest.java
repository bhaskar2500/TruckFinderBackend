package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
public class CompTest implements CommandLineRunner {

    public void run(String[] s){
        System.out.println("----- Class loader for Array"+ArrayList.class.getClassLoader() );
        System.out.println("----- Class loader for Runner"+this.getClass().getClassLoader() );
        System.out.println("----- Class loader for SpringBOot"+SpringBootApplication.class.getClassLoader() );
    }
    
}
