package studi.kasus.java.oop.aplikasi.todolist.repository;

import studi.kasus.java.oop.aplikasi.todolist.entity.Todolist;

public interface TodolistRepository {
    // bikin function atau method yang akan kita gunakan

    // 1. mendapatkan semua todolistnya, dan simpan ke array
    Todolist[] getAll();

    // 2. untuk menambah todolist
    void add(Todolist todolist);

    // 3. remove todolist
    void remove(Integer number);
}
