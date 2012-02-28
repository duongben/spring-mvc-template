package com.duongben.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author duongben
 */
@Controller
public class SimpleWebController {

  
    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public @ResponseBody String greet() {
        return "Greetings!";
    }

    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
    
}
