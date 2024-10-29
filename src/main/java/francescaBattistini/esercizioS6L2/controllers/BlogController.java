package francescaBattistini.esercizioS6L2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogPosts")
public class BlogController {
    //@Autowired
    //private BlogService blogservice;

    @GetMapping("/getExemple")
    public String PostExample() {

        return "Ciao, io sono l'endpoint che risponde alle richieste GET";
    }
}
