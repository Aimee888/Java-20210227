package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class helloword {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld () {
        return "Hello World !";
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public @ResponseBody Object users(){
        List<String> userList = new ArrayList<>();
        userList.add("tom");
        userList.add("marry");
        userList.add("jack");
        System.out.println("get request, users api");
        return userList;
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody Object login(String name, String pwd){
        Map<String, Object> map = new HashMap<>();
        if("123".equals(pwd) && "jack".equals(name)){
            map.put("status", 0);
        }else{
            map.put("status", -1);
        }
        System.out.println("get request, login api");
        return map;
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public @ResponseBody Object info(String name){
        List<String> userList = new ArrayList<>();
        userList.add(name);
        userList.add(name.length() + "");
        System.out.println("get request, info api");
        return userList;
    }
}
