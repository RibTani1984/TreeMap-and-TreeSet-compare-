import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> surname = new ArrayList<>();
        surname.add(new Person("Lena", "Averina Silina", 18));
        surname.add(new Person("Sergey", "Lastochcin", 25));
        surname.add(new Person("Leonid", "Surkov Molin", 36));
        surname.add(new Person("Liza", "Averina Silina", 8));
        surname.add(new Person("Mark", "Surkov Molin", 35));
        surname.add(new Person("Lena", "Surkova Molina Regina", 30));
        System.out.println("Список по знатности/возрасту:");
        Collections.sort(surname, (b1, b2) -> {
            int word1 = b1.getSurname().split(" ").length;
            int word2 = b2.getSurname().split(" ").length;
            if (word1 < word2)
                return 1;
            else if (word1 > word2)
                return -1;
            else
                return Integer.compare(b2.getAge(), b1.getAge());
        });
        System.out.println(surname);
    }
}
