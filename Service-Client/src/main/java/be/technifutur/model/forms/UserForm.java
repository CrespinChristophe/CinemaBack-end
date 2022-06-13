package be.technifutur.model.forms;


import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Builder
public class UserForm {

    @NotBlank
    @Size(min = 1, max = 50)
    private String nom;

    @NotBlank
    @Size(min = 0, max =50)
    private String prenom;

    @NotBlank
    @Size(min = 1, max = 80)
    private String adresse;

    @NotBlank
    private String dateNaissance;

    @NotBlank
    @Size(min = 1, max = 13)
    private String numeroTel;

    @NotBlank
    @Size(min = 1, max = 50)
    private String email;

}
