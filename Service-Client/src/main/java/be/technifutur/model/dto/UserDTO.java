package be.technifutur.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String dateNaissance;
    private String numeroTel;
    private String email;

}
