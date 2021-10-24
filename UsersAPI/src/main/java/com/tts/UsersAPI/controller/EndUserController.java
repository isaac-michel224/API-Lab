package com.tts.UsersAPI.controller;

import com.tts.UsersAPI.model.EndUser;
import com.tts.UsersAPI.repository.EndUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EndUserController {

    @Autowired
    EndUserRepository EnduserRepository;

    @GetMapping("/users")
public List<EndUser> getEndUsers() {
        return (List<EndUser>) repository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<EndUser> getEndUserById(@PathVariable(value="id") Long id) {
        return repository.findById(id);
    }

    @PostMapping("/users")
    public void createEndUser(@RequestBody EndUser Enduser) {
        repository.save(Enduser);
    }

    @DeleteMapping("/users/{id}")
    public void createEndUser(@PathVariable(value="id") Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/users")
    public List<EndUser> getEndUsers(@RequestParam(value="state", required=false) String state) {
        if (state != null) {
            return (List<EndUser>) repository.findByState(state);
        }
        return (List<EndUser>) repository.findAll();
    }

}
