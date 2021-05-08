package studi.kasus.java.oop.aplikasi.todolist.service;

import studi.kasus.java.oop.aplikasi.todolist.entity.Todolist;
import studi.kasus.java.oop.aplikasi.todolist.repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {

        Todolist[] model = todolistRepository.getAll();

        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
            Todolist todolist = model[i];
            int nomor = i + 1;

            if (todolist != null){
                System.out.println(nomor + ". " + todolist.getTodo());
            }
        }
    }

    @Override
    public void addTodolist(String todo) {

    }

    @Override
    public void removeTodolist(Integer number) {

    }
}
