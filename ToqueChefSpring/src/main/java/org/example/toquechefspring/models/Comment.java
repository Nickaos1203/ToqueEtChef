package org.example.toquechefspring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idComment;
    private  String title;
    private String notice;
    private float grade;

    // Une recette peut avoir plusieurs commentaires
    @ManyToOne
    private Recipe recipe;

    // Un utilisateur peut rédiger plusieurs commentaires
    @ManyToOne
    private User author;
}
