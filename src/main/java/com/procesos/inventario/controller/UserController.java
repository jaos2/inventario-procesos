package com.procesos.inventario.controller;

import com.procesos.inventario.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("users/{id}")
    public User getUserById(@PathVariable Long id){
        User user = new User(id,"pepito","perez", "calle 20","jaosoriosa@ufpso.edu.co","3157395956","123456789","1066063457");
                return user;

    }
}
