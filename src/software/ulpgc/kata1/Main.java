package software.ulpgc.kata1;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sara", LocalDate.of(1999,1,1));
        System.out.println(person.toString());
    }
}
