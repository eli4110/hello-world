package com.elihuang.btctrademachine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author elihuang
 */
@Controller
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public String hello() {
        log.info("HelloController log");
        return "hello";
    }
}

