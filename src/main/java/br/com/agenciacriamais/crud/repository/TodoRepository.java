package br.com.agenciacriamais.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenciacriamais.crud.model.Todo;

/**
 * @author Jean Paul - <jeanpaulwebb@gmail.com>
 * @class TodoRepository
 * @description Class responsible for the 'TODO'
 * @date 05/04/2022
 */
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
