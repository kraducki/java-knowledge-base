package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kajetan", 100));
        people.add(new Person("Ada", 20));
        people.add(new Person("Wojtus", 1010));

        //Let's assume we want to create a club of rich people

        List<Person> hundredClub = new ArrayList<>();

        for(Person p: people) {
            if (p.billions > 100) {
                hundredClub.add(p);
            }
        }

        // The code above works, but Streams will do the same with less code:
        List<Person> streamHundredClub = people.stream()
                .filter(person -> person.billions > 100).collect(Collectors.toList());

        //We also just want to sort the list
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
    }
}
