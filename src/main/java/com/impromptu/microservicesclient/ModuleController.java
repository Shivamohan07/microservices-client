package com.impromptu.microservicesclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuleController {

    @Value("${prop1}")
    String prop1;

    @Value("${prop2}")
    String prop2;

    @Value("${prop3}")
    String prop3;

    @RequestMapping("/component")
    public String getProp1(Model m){
        m.addAttribute("property1",prop1);
        m.addAttribute("property2",prop2);
        m.addAttribute("property3",prop3);
        return "componentview";
    }
}
