package org.example.toquechefspring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecipe;
    private String name;
    private String difficulty;
    private int numberPerson;
    private int duration;
    private String description;
    private String image;

    // Un auteur peut créer plusieurs recettes
    @ManyToOne
    private User author;

    // Une recette comporte plusieurs étapes
    @OneToMany(mappedBy = "recipe")
    private List<Step> steps;

    // Une recette peut avoir plusieurs commentaires
    @OneToMany(mappedBy = "recipe")
    private List<Comment> comments;

}
