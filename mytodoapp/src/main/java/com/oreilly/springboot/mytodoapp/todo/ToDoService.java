package com.oreilly.springboot.mytodoapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class ToDoService {
    private static List<ToDo> todos = new ArrayList<>() ;
    private static int toDoCount = 0;
    static {
        todos.add(new ToDo(++toDoCount,"user", "Learn AWS", LocalDate.now().plusYears(1), false) );
        todos.add(new ToDo(++toDoCount,"user", "Learn Java", LocalDate.now().plusYears(2), false) );
    }
    public List<ToDo> findByUsername(String username){
        return todos;
    }
    public void addToDo(String username, String description, LocalDate targetDate, boolean done){
        ToDo todo = new ToDo(++toDoCount, username, description, targetDate, done);
        todos.add(todo);
    }
}
