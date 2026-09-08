package persons;

public class Person {

    private String name;
    private String surname;
    private String gender;

    public Person(
        String name, String surname, String gender
    ) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public String getFullName() {
        return name + " " + surname;
    }
}
