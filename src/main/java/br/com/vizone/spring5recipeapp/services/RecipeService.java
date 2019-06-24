package br.com.vizone.spring5recipeapp.services;

import br.com.vizone.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
