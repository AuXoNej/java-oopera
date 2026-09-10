package persons;

public class Director extends Person {

    private Integer numberOfShows;

    public Director(
        String name, String surname, String gender, Integer numberOfShows
    ) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printFullName() {
        System.out.println(getFullName());
    }
}
