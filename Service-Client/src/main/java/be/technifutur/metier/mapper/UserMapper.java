package be.technifutur.metier.mapper;


import be.technifutur.model.dto.UserDTO;
import be.technifutur.model.entities.User;
import be.technifutur.model.forms.UserForm;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User formToEntity(UserForm form){

        if(form == null)
            return null;

        return User.builder()
                .nom(form.getNom())
                .prenom(form.getPrenom())
                .adresse(form.getAdresse())
                .dateNaissance(form.getDateNaissance())
                .numeroTel(form.getNumeroTel())
                .email(form.getEmail())
                .build();

    }

    public UserDTO entityToDTO(User entity){

        if(entity == null)
            return null;

        return UserDTO.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .prenom(entity.getPrenom())
                .adresse(entity.getAdresse())
                .dateNaissance(entity.getDateNaissance())
                .numeroTel(entity.getNumeroTel())
                .email(entity.getEmail())
                .build();

    }


}
