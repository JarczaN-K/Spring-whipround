package jk.whipround.controller;

import jk.whipround.model.Donation;
import jk.whipround.model.Whipround;
import jk.whipround.model.WhiproundSum;
import jk.whipround.service.WhiproundService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WhiproundController {

    private final WhiproundService whiproundService;

    public WhiproundController(WhiproundService whiproundService) {
        this.whiproundService = whiproundService;
    }

    @GetMapping("/")
    public ModelAndView showWhiprounds() {
        List<WhiproundSum> whiprounds = whiproundService.getWhiproundList();

        ModelAndView modelAndView = new ModelAndView("whipround");
        modelAndView.addObject("whiproundSums", whiprounds);
        return modelAndView;

    }

    @GetMapping("/whipround/{id}")
    public ModelAndView getDonationPage(@PathVariable Long id) {
        Donation donation = new Donation();
        Whipround whipround = new Whipround();
        whipround.setId(id);
        donation.setWhipround(whipround);
        ModelAndView modelAndView = new ModelAndView("donation");
        modelAndView.addObject("donation", donation);
        return modelAndView;
    }

    @PostMapping("/donate")
    public String donate(@ModelAttribute Donation donation){
        whiproundService.addDonation(donation);
        return "redirect:/";
    }

}
