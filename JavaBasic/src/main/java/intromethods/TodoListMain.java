package intromethods;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList tl = new TodoList();
        tl.addTodDo("1");
        tl.addTodDo("2");
        tl.addTodDo("3");

        System.out.println(tl.toString());
    }
}
