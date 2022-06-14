package be.technifutur.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String dateNaissance;
    private String numeroTel;
    private String email;

}
