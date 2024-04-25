package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodolist() {

        TodoList[] model = todoListRepository.getAll();

        for (int i = 0; i < model.length; i++){
            var todo = model[i]; // Accessing the current element at index i

            var no = i + 1;

            if (todo != null){
                System.out.println(no + "." + " " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodolist(String todo) {
        TodoList todoList = new TodoList(todo);

        todoListRepository.add(todoList);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean sucess = todoListRepository.remove(number);

        if (sucess){
            System.out.println("succes remove todo : " + number);
        } else {
            System.out.println("failed remove toto : " + number);
        }
    }
}
