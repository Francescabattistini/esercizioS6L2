package francescaBattistini.esercizioS6L2.controllers;

import francescaBattistini.esercizioS6L2.entities.Blogpost;
import francescaBattistini.esercizioS6L2.payloads.BlogPayload;
import francescaBattistini.esercizioS6L2.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogController {
    @Autowired
    private BlogService blogservice;

    // 1. GET http://localhost:3002/blogpost
    @GetMapping
   public List <Blogpost> getBlog(){
        return this.blogservice.findAll();
    }


//2.post http://localhost:3002/blogpost

    @PostMapping
    public Blogpost saveBlog(@RequestBody BlogPayload body){

    }
}
