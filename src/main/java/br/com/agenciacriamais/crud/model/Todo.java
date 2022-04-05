package br.com.agenciacriamais.crud.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Jean Paul - <jeanpaulwebb@gmail.com>
 * @class Todo
 * @description Class responsible for the 'TODO'
 * @date 05/04/2022
 */
@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String description;
	
	@Column
	private Boolean done;
	
	@Column 
	private LocalDateTime createdDate;
	
	@Column 
	private LocalDateTime doneDate;
	
}
