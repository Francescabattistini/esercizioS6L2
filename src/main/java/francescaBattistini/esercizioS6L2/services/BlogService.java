package francescaBattistini.esercizioS6L2.services;

import francescaBattistini.esercizioS6L2.entities.Blogpost;

import java.util.ArrayList;
import java.util.List;

public class BlogService {
    private List <Blogpost> blogList = new ArrayList<>();
    public List <Blogpost> findAll(){
        return this.blogList;
    }
}
