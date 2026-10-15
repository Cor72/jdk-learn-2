package org.example.jdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/index")
public class JdkApplication {
    public static void main(String[] args){ SpringApplication.run(JdkApplication.class,args);}
//    @GetMapping
//    public String index()
//    {
//        return "get request ";
//    }

    @GetMapping("/{id}")
    public String index(@PathVariable long id){
        System.out.printf("ID=%s\n,id");
        return "get request compelete";
    }
    @GetMapping
    public String index2(@RequestParam Long id,@RequestParam String name){
        System.out.printf("ID=%s,name=%s\n",id,name);
        return "get simple request";
    }
    @PostMapping
    public String save(@RequestBody Map<String,String> map){
        System.out.printf(map.toString());
        return "Post request";
    }

    @DeleteMapping("/{id}")
    public  String delete(@PathVariable Long id){
        System.out.printf("ID=%s\n",id);
        return "delete request complete";
    }
}