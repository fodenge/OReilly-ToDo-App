package com.oreilly.springboot.mytodoapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class ToDoService {
    private static List<ToDo> todos = new ArrayList<>();

    static {
        todos.add(new ToDo(1,"user", "Learn AWS", LocalDate.now().plusYears(1), false) );
        todos.add(new ToDo(2,"user", "Learn Java", LocalDate.now().plusYears(2), false) );
    }
    public List<ToDo> findByUsername(String username){
        return todos;
    }
}
