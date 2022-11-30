package com.erk.able.controllers;

import com.erk.able.dao.HolderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/holder")
public class HoldersController {

    private final HolderDAO holderDAO;

    @Autowired
    public HoldersController(HolderDAO holderDAO) {
        this.holderDAO = holderDAO;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("holder", holderDAO.index());
        return "holders/index";
    }
}
