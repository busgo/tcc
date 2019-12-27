package com.busgo.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author busgo
 * @date 2019-12-10 20:07
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class TccApplication {


    public static void main(String[] args) {

        SpringApplication.run(TccApplication.class, args);
    }
}
