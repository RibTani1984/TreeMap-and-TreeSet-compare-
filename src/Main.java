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
        Collections.sort(surname, new NotableSurname());
        System.out.println(surname);
    }
}