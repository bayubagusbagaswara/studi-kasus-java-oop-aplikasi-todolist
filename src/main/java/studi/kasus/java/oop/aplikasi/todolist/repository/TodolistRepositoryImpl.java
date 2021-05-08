package studi.kasus.java.oop.aplikasi.todolist.repository;

import studi.kasus.java.oop.aplikasi.todolist.entity.Todolist;

public class TodolistRepositoryImpl implements  TodolistRepository{

    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    @Override
    public void add(Todolist todolist) {

    }

    @Override
    public void remove(Integer number) {

    }
}
