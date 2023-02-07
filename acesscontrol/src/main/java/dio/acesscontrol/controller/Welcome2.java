package dio.acesscontrol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome2 {
    @GetMapping

    public String welcome(){
        return "Welcome from spring boot web <br> <h2>INTRO</h2>";
    }
}

