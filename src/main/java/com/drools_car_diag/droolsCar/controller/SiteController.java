package com.drools_car_diag.droolsCar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SiteController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/main")
    public String main() {
        return "main_menu";
    }

    @GetMapping("/main/contain")
    public String contain(@RequestParam(name="part", required=false, defaultValue="migacze") String part, Model model) {
        model.addAttribute("part", part);
        return "/contain/" + part;
    }

    @GetMapping("/main/parts")
    public String partsImages(@RequestParam(name="img", required=false, defaultValue="migacze") String img, Model model) {
        model.addAttribute("img", img);
        return "@{/img/parts/migacz.jpg}";
    }

}
