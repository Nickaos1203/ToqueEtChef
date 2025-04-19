package org.example.toquechefspring.services;

import org.example.toquechefspring.models.Recipe;
import org.example.toquechefspring.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecipeService {
    Recipe saveRecipe(Recipe recipe);
    Recipe updateRecipe(Recipe recipe);
    void deleteRecipeById(Long id);
    Recipe getRecipe(long id);
    List<Recipe> getAllRecipe();


}
