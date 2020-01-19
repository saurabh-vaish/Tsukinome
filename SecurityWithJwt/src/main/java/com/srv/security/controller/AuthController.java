package com.srv.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 19-Jan-20
 */
@RestController
@RequestMapping("/")
public class AuthController {
    @GetMapping
    public String hii()
    {
        return "hello";
    }
}
