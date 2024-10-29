package francescaBattistini.esercizioS6L2.services;

import francescaBattistini.esercizioS6L2.entities.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogService {
    private List <Blog> blogList = new ArrayList<>();
    public List <Blog> findAll(){
        return this.blogList;
    }
}
