package br.com.agenciacriamais.crud;

import br.com.agenciacriamais.crud.model.Todo;
import br.com.agenciacriamais.crud.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@SpringBootApplication
public class AgenciaCriaMaisApplication {

    /*
     *  Dependency injection with Autowired
     *  @Autowired
     *  private TodoRepository todoRepository;
    */
    private final TodoRepository todoRepository;

    public AgenciaCriaMaisApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Bean
    public CommandLineRunner init() {

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Todo todo = new Todo();
                todo.setDescription("Criando uma task");
                todo.setCreatedDate(LocalDateTime.now());
                todoRepository.save(todo);
            }
        };

    }


    public static void main(String[] args) {
        SpringApplication.run(AgenciaCriaMaisApplication.class, args);
    }

}
