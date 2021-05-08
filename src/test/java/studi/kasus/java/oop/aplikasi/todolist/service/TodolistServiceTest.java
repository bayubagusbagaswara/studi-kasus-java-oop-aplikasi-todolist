package studi.kasus.java.oop.aplikasi.todolist.service;

import studi.kasus.java.oop.aplikasi.todolist.entity.Todolist;
import studi.kasus.java.oop.aplikasi.todolist.repository.TodolistRepository;
import studi.kasus.java.oop.aplikasi.todolist.repository.TodolistRepositoryImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        // coba tambahkan datanya dulu
        todolistRepository.data[0] = new Todolist("belajar java dasar");
        todolistRepository.data[1] = new Todolist("belajar java oop");
        todolistRepository.data[2] = new Todolist("belajar standard classes");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.showTodolist();
    }
}
