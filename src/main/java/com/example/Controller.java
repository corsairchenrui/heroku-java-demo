package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cherry on 2016/8/2.
 */
@RestController
@RequestMapping
public class Controller {
    @RequestMapping
    public Object getEnv() {
        return System.getenv();
    }
}
