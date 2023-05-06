import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> surname = new ArrayList<>();
        surname.add(new Person("Lena", "Averina Silina", 18));
        surname.add(new Person("Sergey", "Lastochcin", 25));
        surname.add(new Person("Leonid", "Surkov Molin", 36));
        surname.add(new Person("Liza", "Averina Silina", 8));
        surname.add(new Person("Mark", "Surkov Molin", 35));
        surname.add(new Person("Lena", "Surkova Molina Regina", 30));
        surname.add(new Person("Sony", "Averina Silina", 5));
        System.out.println("Список по знатности/возрасту(за исключением восемнадцатилетних):");
        Predicate<Person> exceptions = age -> age.getAge() <= 18;
        surname.removeIf(exceptions);
        Collections.sort(surname, new NotableSurname());
        System.out.println(surname);
    }
}
