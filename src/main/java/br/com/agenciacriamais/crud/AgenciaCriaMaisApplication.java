package br.com.agenciacriamais.crud;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.agenciacriamais.crud.model.Todo;
import br.com.agenciacriamais.crud.repository.TodoRepository;

@SpringBootApplication
public class AgenciaCriaMaisApplication {
	
	
	@Autowired
	private TodoRepository todoRepository; 
	
	@Bean
	public CommandLineRunner init() {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Todo todo  = new Todo();
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
