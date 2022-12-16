package com.menuRestaurante.repositories;

import org.springframework.data.repository.CrudRepository;

import com.menuRestaurante.models.Menu;


public interface MenuRepository  extends CrudRepository<Menu, Long>{

}
