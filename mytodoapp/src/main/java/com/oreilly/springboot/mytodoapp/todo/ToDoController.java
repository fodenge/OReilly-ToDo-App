package com.oreilly.springboot.mytodoapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {

        List<ToDo> todos = toDoService.findByUsername("user");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
}
