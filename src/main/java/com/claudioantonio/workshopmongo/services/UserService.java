package com.claudioantonio.workshopmongo.services;

import com.claudioantonio.workshopmongo.domain.User;
import com.claudioantonio.workshopmongo.dto.UserDTO;
import com.claudioantonio.workshopmongo.repositories.UserRepository;
import com.claudioantonio.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user) {
        return repository.insert(user);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
