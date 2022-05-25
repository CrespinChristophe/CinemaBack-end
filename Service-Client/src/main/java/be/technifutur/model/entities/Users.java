package be.technifutur.model.entities;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
@Entity
@Builder
public class Users {

    @Id
    //PK générée auto via la startegie IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String nom;

    @NotNull
    @Column(nullable = false)
    private String prenom;

    @NotNull
    @Column(nullable = false)
    private String adresse;

    @NotNull
    @Column(nullable = false)
    private Date dateNaissance;

    @NotNull
    @Column(nullable = false)
    private String numeroTel;

    @NotNull
    @Column(nullable = false)
    private String email;

}
