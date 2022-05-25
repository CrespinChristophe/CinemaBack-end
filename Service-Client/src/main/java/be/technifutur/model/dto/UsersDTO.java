package be.technifutur.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UsersDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private Date dateNaissance;
    private String numeroTel;
    private String email;

}
