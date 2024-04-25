package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();

        todoListRepository.data[0] = new TodoList("yurdi");
        todoListRepository.data[1] = new TodoList("ansyah");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodolist();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodolist("belajar");
        todoListService.addTodolist("sahjghdg");

        todoListService.showTodolist();
    }

    public static void testRemoveTodolist(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodolist("belajar");
        todoListService.addTodolist("belaj");

        todoListService.showTodolist();
        todoListService.removeTodoList(2);
        todoListService.showTodolist();

    }

}
