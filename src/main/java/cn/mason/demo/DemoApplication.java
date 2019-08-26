package cn.mason.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication
@RestController
public class DemoApplication {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(String s) throws IOException {

        if(s.equals("0")){
            throw new IOException("wrong");
        }
        return "hel22lo:"+s;
    }

    @RequestMapping(value = "test")
    public int test(int i,int j){
        return i/j;
    }



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
