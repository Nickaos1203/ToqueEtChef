package org.example.toquechefspring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String role;

    // Un utilisateur peut créer plusieurs recettes
    @OneToMany(mappedBy = "user")
    private List<Recipe> recipes;

    // Un utilisateur peut rédiger plusieurs commentaires
    @OneToMany(mappedBy = "user")
    private List<Recipe> comments;

}
