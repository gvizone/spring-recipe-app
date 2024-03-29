package br.com.vizone.spring5recipeapp.services;

import br.com.vizone.spring5recipeapp.domain.Recipe;
import br.com.vizone.spring5recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRespository;

    public RecipeServiceImpl(RecipeRepository recipeRespository) {
        this.recipeRespository = recipeRespository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRespository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
