package shows;

import persons.Actor;
import persons.Director;
import persons.Person;

import java.util.List;

public class Ballet extends MusicalShow{

    private Person choreographer;

    public Ballet(
        String title, Integer duration, Director director, List<Actor> listOfActors,
        Person musicAuthor, String librettoText,
        Person choreographer
    ) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
