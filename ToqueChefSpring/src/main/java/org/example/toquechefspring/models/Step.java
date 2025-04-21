package org.example.toquechefspring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "steps")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStep;
    private int numberStep;
    private String instruction;

    // Une recette comporte plusieurs étapes
    @ManyToOne
    private Recipe recipe;
}
