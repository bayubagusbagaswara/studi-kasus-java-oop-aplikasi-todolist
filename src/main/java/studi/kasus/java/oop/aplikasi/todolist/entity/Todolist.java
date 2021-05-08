package studi.kasus.java.oop.aplikasi.todolist.entity;

public class Todolist {
    // representasi datanya hanya String aja, dan di enkapsulasi

    /**
     * Representasi Data
     */
    private String todo;

    /**
     * Constructor dengan parameter
     * @param todo
     */
    public Todolist(String todo) {
        this.todo = todo;
    }

    /**
     * Constructor tanpa parameter
     */
    public Todolist() {
    }

    // biasanya untuk representasi data, dibiking setter dan getter

    /**
     * Getter
     * @return
     */
    public String getTodo() {
        return todo;
    }

    /**
     * Setter
     * @param todo
     */
    public void setTodo(String todo) {
        this.todo = todo;
    }
}
