package com.maartenmusic.controller;

import com.maartenmusic.model.ToDoData;
import com.maartenmusic.service.ToDoItemService;
import com.maartenmusic.util.Mappings;
import com.maartenmusic.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

    // == fields ==
    private final ToDoItemService toDoItemService;

    // == constructor ==
    @Autowired
    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    // == model attributes ==
    @ModelAttribute
    public ToDoData toDoData() {
        return toDoItemService.getToDoData();
    }

    // == handler methods ==

    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
