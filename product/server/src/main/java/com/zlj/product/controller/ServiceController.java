package com.zlj.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张璐杰
 * 2018/3/17 15:32
 */
@RestController
public class ServiceController {

    @GetMapping("/msg")
    public String msg() {
        return "this is project' msg";
    }
}
