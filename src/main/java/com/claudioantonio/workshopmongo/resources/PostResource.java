package com.claudioantonio.workshopmongo.resources;

import com.claudioantonio.workshopmongo.domain.Post;
import com.claudioantonio.workshopmongo.resources.util.URL;
import com.claudioantonio.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    /*value="text": Para identificar o nome do parâmetro na URL.
    * defaultValue="": caso o parâmetro não tenha valor informado, é colocado o padrão vazio.*/
    @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

}
