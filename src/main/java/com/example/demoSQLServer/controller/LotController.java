package com.example.demoSQLServer.controller;

import com.example.demoSQLServer.entities.ChangeControl;
import com.example.demoSQLServer.entities.Lot;
import com.example.demoSQLServer.service.ChangeControlService;
import com.example.demoSQLServer.service.LotService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LotController {

    private final LotService lotService;
    private final ChangeControlService changeControlService;

    public LotController(LotService lotService, ChangeControlService changeControlService) {
        this.lotService = lotService;
        this.changeControlService = changeControlService;
    }

    @GetMapping("/lots")
    public String afficherLots(
            @RequestParam(name = "site", required = false) String site,
            @RequestParam(name = "produit", required = false) String produit,
            Model model) {

        List<Lot> lots = lotService.getLotsFiltrés(site, produit);
        model.addAttribute("lots", lots);

        List<ChangeControl> changeControls = changeControlService.getLotsFiltresChange(site, produit);
        model.addAttribute("changeControls", changeControls);


        return "index";
    }
}
