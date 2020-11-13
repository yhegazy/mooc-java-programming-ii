import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> list;

    public Employees(){
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.list.add(personToAdd);
    }

    public void add(List<Person> personToAdd){
        for(Person person: personToAdd){
            this.list.add(person);
        }
    }

    public void print(){
        Iterator<Person> iterator = this.list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*

        for(int i = 0; i < this.list.size(); i++){
            System.out.println(this.list.get(i));
        }
        */
    }

    public void print(Education education){
        Iterator<Person> iterator = this.list.iterator();
        
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                System.out.println(this.list.toString());
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = this.list.iterator();
        
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }
}
