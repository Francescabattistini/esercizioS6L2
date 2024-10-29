package francescaBattistini.esercizioS6L2.controllers;

import francescaBattistini.esercizioS6L2.entities.Blog;
import francescaBattistini.esercizioS6L2.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogController {
    @Autowired
    private BlogService blogservice;

    // 1. GET http://localhost:3001/blogpost
    @GetMapping
   public List <Blog> getBlog(){
        return this.blogservice.findAll();
    }

}
