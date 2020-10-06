import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList(){
        this.todoList = new ArrayList<>();
    }

    public void add(String task){
        this.todoList.add(task);
    }

    public void print(){
        int index = 1;

        for (String item : this.todoList){
            System.out.println(index + ": " + item);
            index++;
        }
    }

    public void remove(int number){
        this.todoList.remove(this.todoList.get(number-1));
    }
}

