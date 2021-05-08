package studi.kasus.java.oop.aplikasi.todolist.repository;

import studi.kasus.java.oop.aplikasi.todolist.entity.Todolist;

public class TodolistRepositoryImpl implements  TodolistRepository{

    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    // method untuk cek model udah penuh atau belum
    public boolean isFull(){
        boolean isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    // method function untuk resize
    public void resizeIfFull(){
        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull()) {
            Todolist[] temporary = data;
            data = new Todolist[data.length * 2];
            for (int i = 0; i < temporary.length; i++) {
                data[i] = temporary[i];
            }
        }
    }

    @Override
    public void add(Todolist todolist) {
        resizeIfFull();

        // tambahkan ke posisi yang data array nya NULL
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public void remove(Integer number) {

    }
}
