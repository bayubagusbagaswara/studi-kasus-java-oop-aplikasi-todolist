package studi.kasus.java.oop.aplikasi.todolist;

import studi.kasus.java.oop.aplikasi.todolist.repository.TodolistRepository;
import studi.kasus.java.oop.aplikasi.todolist.repository.TodolistRepositoryImpl;
import studi.kasus.java.oop.aplikasi.todolist.service.TodolistService;
import studi.kasus.java.oop.aplikasi.todolist.service.TodolistServiceImpl;
import studi.kasus.java.oop.aplikasi.todolist.view.TodolistView;

public class AplikasiTodolistV2 {
    public static void main(String[] args) {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodolist();
    }
}
