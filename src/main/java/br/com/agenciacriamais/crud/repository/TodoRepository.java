package br.com.agenciacriamais.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenciacriamais.crud.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
