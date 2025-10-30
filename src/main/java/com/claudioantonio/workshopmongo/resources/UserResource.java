package com.claudioantonio.workshopmongo.resources;

import com.claudioantonio.workshopmongo.domain.User;
import com.claudioantonio.workshopmongo.dto.UserDTO;
import com.claudioantonio.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> user = service.findAll();
        // para cada User x retorna um novo UserDTO
        List<UserDTO> list = user.stream().map(x -> new UserDTO(x)).toList();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
        User u = service.findById(id);
        UserDTO userDTO = new UserDTO(u);
        return ResponseEntity.ok().body(userDTO);
    }
}
