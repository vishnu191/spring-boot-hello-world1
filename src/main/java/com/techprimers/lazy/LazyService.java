package com.techprimers.lazy;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class LazyService {

    public LazyService() {
        System.out.println("Hello Service:: Constructor loaded");
    }

    public String hello() {
        return "Hello World From Version V2!";
    }
}
