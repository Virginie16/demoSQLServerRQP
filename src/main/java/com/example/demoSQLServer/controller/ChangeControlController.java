package com.example.demoSQLServer.controller;

import com.example.demoSQLServer.entities.ChangeControl;
import com.example.demoSQLServer.service.ChangeControlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ChangeControlController {

    private final ChangeControlService changeControlService;

    public ChangeControlController(ChangeControlService changeControlService) {
        this.changeControlService = changeControlService;
    }

    @GetMapping("/changeControls")
    public String afficherChangeControl(
        @RequestParam(name = "site", required = false) String site,
        @RequestParam(name = "produit", required = false) String produit,
        Model model) {

            List<ChangeControl> changeControls = changeControlService.getLotsFiltresChange(site, produit);
            model.addAttribute("changeControls", changeControls);
            return "index";
    }

}
