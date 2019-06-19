package br.com.vizone.spring5recipeapp.repositories;

import br.com.vizone.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}