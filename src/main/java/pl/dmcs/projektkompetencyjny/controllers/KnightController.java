package pl.dmcs.projektkompetencyjny.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dmcs.projektkompetencyjny.domain.Knight;
import pl.dmcs.projektkompetencyjny.domain.repository.KnightRepository;
import pl.dmcs.projektkompetencyjny.services.KnightService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService service;

    @RequestMapping("/knights")
    public String getKnights(Model model){
        List<Knight> allKnights = service.getAllKnights();
        model.addAttribute("knights",allKnights);
    return "knights";
    }
    @RequestMapping("/newknight")
    public String createKnight (Model model){
        model.addAttribute("knight",new Knight());
        return "knightform";
    }
    @RequestMapping(value = "/knights", method = RequestMethod.POST)
    public String getKnights(Knight knight){
        service.saveKnight(knight);
        return "redirect:/knights";
    }
}
