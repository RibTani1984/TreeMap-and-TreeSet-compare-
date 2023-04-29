import java.util.Comparator;

public class NotableSurname implements Comparator<Person> {
    @Override
    public int compare(Person b1, Person b2) {
        int word1 = b1.getSurname().split(" ").length;
        int word2 = b2.getSurname().split(" ").length;
        if (word1 < word2) {
            return 1;
        } else if (word1 > word2) {
            return -1;
        } else {
            return Integer.compare(b2.getAge(), b1.getAge());
        }
    }
}




