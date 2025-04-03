package com.oreilly.springboot.mytodoapp.todo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {

        List<ToDo> todos = toDoService.findByUsername("user");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        String username = (String) model.get("name");
        ToDo todo = new ToDo(0, username, "", LocalDate.now().plusYears(1),false);
        model.put("todo", todo);
        return "addToDo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewToDo(ModelMap model, @Valid ToDo todo, BindingResult result ) {
        if (result.hasErrors()){
            return "redirect:add-todo";
        }
        String username = (String) model.get("name");
        toDoService.addToDo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }
}
