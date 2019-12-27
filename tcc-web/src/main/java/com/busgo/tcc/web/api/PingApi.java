package com.busgo.tcc.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author busgo
 * @date 2019-12-10 20:09
 */
@RestController
public class PingApi {




    @GetMapping("/ping")
    public String ping() {



        return "pong";

    }


}
