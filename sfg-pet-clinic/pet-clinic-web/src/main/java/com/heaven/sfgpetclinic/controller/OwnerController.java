package com.heaven.sfgpetclinic.controller;

import com.heaven.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;
    @GetMapping({"","/index","/index.html"})
    public String listAllOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owner/index";
    }
}
