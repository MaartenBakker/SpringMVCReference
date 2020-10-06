package com.maartenmusic.service;

import com.maartenmusic.model.ToDoData;
import com.maartenmusic.model.ToDoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    // == Fields ==
    @Getter
    private final ToDoData toDoData = new ToDoData();

    // == public methods ==

    @Override
    public void addItem(ToDoItem toDoItemToAdd) {
        toDoData.addItem(toDoItemToAdd);
    }

    @Override
    public void removeItem(int id) {
        toDoData.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return toDoData.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem toDoItemToUpdate) {
        toDoData.updateItem(toDoItemToUpdate);
    }

}
