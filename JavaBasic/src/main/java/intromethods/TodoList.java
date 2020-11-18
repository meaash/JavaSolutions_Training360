package intromethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoList {

    private List<Todo> todolist = new ArrayList<>();

    public void addTodDo(String caption){
        todolist.add(new Todo(caption));
    }
    public void finishToDos(String caption){
        for (Todo todo:todolist) {
            if(todo.getCaption().equals(caption)){
                todo.finish();
            }
        }
    }
    public void finishAllTodos(List<String> todostofinish){
        for (String item:todostofinish) {
            for (Todo todo:todolist) {
                if(todo.getCaption().equals(item)){
                    todo.finish();
                }
            }
        }
    }

    public List<String> todosToFinish(){
        List<String> todotofinishlist = new ArrayList<>();
        for (Todo todo:todolist) {
            if(!todo.isFinished()){
                todotofinishlist.add(todo.getCaption());
            }
        }
        return todotofinishlist;
    }

    public int numberOfFinishedTodos(){
        int finishedtodos = 0;
        for (Todo todo:todolist) {
            if(!todo.isFinished()){
                finishedtodos++;
            }
        }
        return finishedtodos;

    }

    @Override
    public String toString() {
        return "TodoList{" +
                "todolist=" + todolist.toString() +
                '}';
    }

}
