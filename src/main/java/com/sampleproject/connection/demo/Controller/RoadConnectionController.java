package com.sampleproject.connection.demo.Controller;


import com.sampleproject.connection.demo.Service.RoadConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class RoadConnectionController {

    @Autowired
    RoadConnectionService roadConnectionService;



    @RequestMapping(value = "/connected",
            method = RequestMethod.GET)
    public String handleTravelPath(Model model, @RequestParam(value = "origin") String origin,
                                   @RequestParam(value = "destination") String destination
                                   ) {


        model.addAttribute("start");
        //Logger logger = LoggerFactory.getLogger(LoggingController.class);

        return roadConnectionService.validatePath(origin, destination);


        //model.put("returnVlaue", returnValue);
        //return returnValue;
    }

    @RequestMapping(value = "/add",
            method = RequestMethod.GET)
    public String add(Model model)  {

        model.addAttribute("strter");
        return "starter";
    }
}