package software.ulpgc.kata1;
import java.time.LocalDate;
public class Person {
    private final String name;
    private final LocalDate birthdayDate;

    public Person(String name, LocalDate birthdayDate) {
        this.name = name;
        this.birthdayDate = birthdayDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - birthdayDate.toEpochDay());
    }

    private int toYears(long days){
        return (int) (days/365.25);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", age=" + getAge() +
                '}';
    }
}
