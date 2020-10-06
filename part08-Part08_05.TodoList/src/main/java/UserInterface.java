import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if(command.equals("stop")){
                break;
            }

            if(command.equals("add")){
                System.out.println("To add: ");
                String input = scanner.nextLine();
                this.list.add(input);
            
            } else if(command.equals("list")){
                this.list.print();
            
            } else if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int index = scanner.nextInt();
                this.list.remove(index);
            } 
        }
    }
}