package ru.aparfenov.calcapi;

import org.springframework.web.bind.annotation.*;

/**
 * Class description
 * author: aparfenov
 * date: 3/6/24
 */

@CrossOrigin
@RestController
public class CalcController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("/add")
    public Integer add(@RequestParam(value = "a") Integer a,
                      @RequestParam(value = "b") Integer b) {
        return a + b;
    }

    @PostMapping("/subs")
    public Integer subs(@RequestParam(value = "a") Integer a,
                       @RequestParam(value = "b") Integer b) {
        return a - b;
    }

    @PostMapping("/mult")
    public Integer mult(@RequestParam(value = "a") Integer a,
                        @RequestParam(value = "b") Integer b) {
        return a * b;
    }

    @PostMapping("/div")
    public Integer div(@RequestParam(value = "a") Integer a,
                        @RequestParam(value = "b") Integer b) {
        return a / b;
    }
}
