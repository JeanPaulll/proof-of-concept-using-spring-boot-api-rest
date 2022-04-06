package br.com.agenciacriamais.crud.rest;

import br.com.agenciacriamais.crud.model.Todo;
import br.com.agenciacriamais.crud.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

/**
 * @author Jean Paul - <jeanpaulwebb@gmail.com>
 * @class TodoController
 * @description Class to handle rest requests
 * @date 06/04/2022
 */
@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @GetMapping("{id}")
    public Todo getById(@PathVariable Long id){
        return todoRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
