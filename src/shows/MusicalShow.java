package shows;

import persons.Actor;
import persons.Director;
import persons.Person;

import java.util.List;

public class MusicalShow extends Show {

    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(
        String title, Integer duration, Director director, List<Actor> listOfActors,
        Person musicAuthor, String librettoText
    ) {
        super(title, duration, director, listOfActors);

        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
