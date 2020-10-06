package com.maartenmusic.service;

import com.maartenmusic.model.ToDoData;
import com.maartenmusic.model.ToDoItem;

public interface ToDoItemService {

    void addItem(ToDoItem toDoItemToAdd);

    void removeItem(int id);

    ToDoItem getItem(int id);

    void updateItem(ToDoItem toDoItemToUpdate);

    ToDoData getToDoData();
}
