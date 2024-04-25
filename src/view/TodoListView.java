package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService){
        this.todoListService = todoListService;
    }

    public void showTodoList(){
        while (true){
            todoListService.showTodolist();
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = InputUtil.input("Pilih");
            if (input.equals("1")){
                addTodoList();
            } else if (input.equals("2")) {
                removeTodolist();
            } else if (input.equals("3")){
                break;
            } else {
                System.out.println("salah pilih");
            };
        }
    };

    public void addTodoList(){
        System.out.println("Menambah todolist");

        var todo = InputUtil.input("todo (x jikabatal)");

        if (todo.equals("x")){
            // batal
        } else {
            todoListService.addTodolist(todo);
        }
    }

    public void removeTodolist(){
        System.out.println("delete todolist");

        var number = InputUtil.input("Nomor yang di hapus (x jikabatal)");

        if (number.equals("x")){
            // batal
        } else {
            todoListService.removeTodoList(Integer.valueOf(number));
        }
    }
}
