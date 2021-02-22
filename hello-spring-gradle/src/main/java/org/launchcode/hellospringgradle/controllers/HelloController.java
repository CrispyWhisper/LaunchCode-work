package org.launchcode.hellospringgradle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ResponseBody
@RequestMapping("hello")
public class HelloController {


    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "hello Spring! ";
//    }

        // lives at /hello/goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye Spring! ";
    }


    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name, Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    // handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name, Model model) {
        String greeting = "Hello, mr. " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }


    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> myNames = new ArrayList<>();
        myNames.add("corn");
        myNames.add("potatoe");
        myNames.add("balance");
        model.addAttribute("names", myNames);
        return "hello-list";
    }
}






