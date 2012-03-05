package com.duongben.sample.mvc;

import com.duongben.sample.model.Rsvp;
import com.duongben.sample.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author duongben
 */
@Controller
public class HomePageController {

    @Autowired RegistrationService registrationService;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showDefaultView() {
        return "redirect:rsvp/new";
    }

    @RequestMapping(value = "/rsvp/new", method = RequestMethod.GET)
    public String showRsvpForm() {
        return "rsvp";
    }
    
    @RequestMapping(value = "/rsvp/new", method = RequestMethod.POST)
    public String processRsvpForm(Rsvp form) {
        registrationService.save(form);
        //TODO: flash results
        return "redirect:rsvp/new";
    }
    
}
