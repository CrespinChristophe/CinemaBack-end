package be.technifutur.metier.service;

import be.technifutur.data.UserRepository;
import be.technifutur.metier.mapper.UserMapper;
import be.technifutur.model.dto.UserDTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;//mettre final car Spring ne les implémente qu'une fois
    private final UserMapper mapper;


    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    //CREATE

    //READ

    @Override
    public List<UserDTO> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(mapper::entityToDTO)
                .toList();
    }

    //UPDATE
    //DELETE
}
