package br.com.vizone.spring5recipeapp.repositories;

import br.com.vizone.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
