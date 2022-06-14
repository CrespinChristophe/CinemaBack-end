package be.technifutur.controller;

import be.technifutur.metier.service.UserService;
import be.technifutur.model.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

private UserService service;

@GetMapping
public List<UserDTO> getAllUsers(){return service.getAllUsers();}

}
