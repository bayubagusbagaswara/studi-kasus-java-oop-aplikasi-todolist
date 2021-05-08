package studi.kasus.java.oop.aplikasi.todolist.view;

import studi.kasus.java.oop.aplikasi.todolist.service.TodolistService;
import studi.kasus.java.oop.aplikasi.todolist.util.InputUtil;

public class TodolistView {
    // tambahkan service nya
    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodolist(){

        while (true){
            // manggil service nya
            todolistService.showTodolist();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            String input = InputUtil.input("Pilih");
            if (input.equals("1")){
              addTodolist();
            } else if (input.equals("2")){
                removeTodolist();
            } else if(input.equals("x")){
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public void addTodolist(){

    }

    public void removeTodolist(){

    }
}
