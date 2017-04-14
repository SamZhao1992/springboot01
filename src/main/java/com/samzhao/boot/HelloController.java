package com.samzhao.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SamZhao on 2017/4/13.
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    private String sayHello(@PathVariable("id") Integer id) {
        return "id: " + id;
    }

//    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @GetMapping(value = "/hi")
    private String hi(@RequestParam( value = "id" ,required = false , defaultValue = "66666") Integer id) {
        return "id: " + id;
    }
}
