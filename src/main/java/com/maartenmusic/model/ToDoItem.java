package com.maartenmusic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class ToDoItem {

    // == Fields ==
    private int id;
    private String title;
    private String details;
    private LocalDate deadline;

    // == Constructor ==
    public ToDoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }
}
