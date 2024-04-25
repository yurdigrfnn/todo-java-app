package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testShow();
    }

    public static void testShow(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListService.addTodolist("ghagf");
        todoListView.showTodoList();
    }
    public static void testAdd(){

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListView.addTodoList();
        todoListView.showTodoList();
    }

    public static void testRemove(){

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListService.addTodolist("d");
        todoListService.addTodolist("3525");
        todoListService.addTodolist("35214212415");

        todoListService.showTodolist();

        todoListView.removeTodolist();

        todoListService.showTodolist();
    }


}
