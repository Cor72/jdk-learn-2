package org.example.jdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/index")
public class JdkApplication {
    public static void main(String[] args){ SpringApplication.run(JdkApplication.class,args);}
    @GetMapping
    public String index()
    {
        return "get request ";
    }

    @GetMapping("/{id}")
    public String index(@PathVariable long id){
        System.out.printf("ID=%s\n,id");
        return "get request compelete";
    }
}
