package br.com.vizone.spring5recipeapp.repositories;

import br.com.vizone.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
