package be.technifutur.model.forms;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Builder
public class UsersForm {

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
    private Date dateNaissance;

    @NotBlank
    @Size(min = 1, max = 13)
    private String numeroTel;

    @NotBlank
    @Size(min = 1, max = 50)
    private String email;

}
