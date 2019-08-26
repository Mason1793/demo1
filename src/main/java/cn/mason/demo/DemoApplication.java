package cn.mason.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @RequestMapping("hello")
    public String hello(String s){
        return "hello";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
