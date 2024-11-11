package com.wiley.realworldjava.regex.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {

    @RequestMapping("/book/{bookId:[0-9]+}")
    public String getBookById(@PathVariable("bookId") String bookId) {
        String result = "";
        return result;
    }
}
