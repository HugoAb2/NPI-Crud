package npi.autoestudo.todoapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import npi.autoestudo.todoapp.model.Todo;
import npi.autoestudo.todoapp.repository.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        if (todo != null)
            todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        return todoRepository.findAll();
    }

    public List<Todo> update(Todo todo) {
        if (todo != null)
            todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        if (id != null)
            todoRepository.deleteById(id);
        return list();
    }
}
