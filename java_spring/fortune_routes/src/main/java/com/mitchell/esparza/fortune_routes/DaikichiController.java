package com.mitchell.esparza.fortune_routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this annotation is needed to make this class a controller 
@RequestMapping("/daikichi") //we add this annotation to the class to make the path for all methods start with /daikichi
public class DaikichiController {
    @RequestMapping("")
    public String index() {
        return "Welcome! Let me tell you your fortune! \n Just type in '/today' or '/tomorrow' at the end of the URL to get your fortune!";
    }
    @RequestMapping("/today")
    public String today() {
        return "Today you will literally explode into 43 pieces of stone. There will be no way to stop this. \n You will be missed.";
    }
    @RequestMapping ("/tomorrow")
    public String tomorrow() {
        return "Tomorrow you will find a bag of money worth 42 quintillion yen on the street. \n Then you will explode right after.";
    }
}
