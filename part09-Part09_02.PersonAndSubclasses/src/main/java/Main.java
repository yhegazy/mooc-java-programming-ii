import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        //Part 1
        Person dada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person fresko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(dada);
        System.out.println(fresko);

        //Part2
        Student bollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(bollie);
        System.out.println("Study credits " + bollie.credits());
        bollie.study();
        System.out.println("Study credits "+ bollie.credits());

        //Part3
        System.out.println(bollie);
        bollie.study();
        System.out.println(bollie);

        //Part4
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
        ollie.study();
        i = i + 1;
        }
        System.out.println(ollie);

        //Part5
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for(Person person: persons){
            System.out.println(person);
        }
    }
}
