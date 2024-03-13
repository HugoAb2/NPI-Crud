package npi.autoestudo.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import npi.autoestudo.todoapp.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}