package studi.kasus.java.oop.aplikasi.todolist.view;

import studi.kasus.java.oop.aplikasi.todolist.repository.TodolistRepository;
import studi.kasus.java.oop.aplikasi.todolist.repository.TodolistRepositoryImpl;
import studi.kasus.java.oop.aplikasi.todolist.service.TodolistService;
import studi.kasus.java.oop.aplikasi.todolist.service.TodolistServiceImpl;

public class TodolistViewTest {

    public static void main(String[] args) {
        testShowTodolist();
    }

    public static void testShowTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");

        todolistView.showTodolist();
    }
}
