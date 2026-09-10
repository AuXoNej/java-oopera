package persons;

import java.util.Objects;

public class Actor extends Person {

    private Integer height;


    public Actor(
        String name, String surname, String gender, Integer height
    ) {
        super(name, surname, gender);
        this.height = height;
    }


    @Override
    public String toString(){
        return getName() + " " + getSurname() + " (" + this.height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;
        return Objects.equals(getName(), actor.getName())
            && Objects.equals(getSurname(), actor.getSurname())
            && Objects.equals(getGender(), actor.getGender())
            && Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getGender(), height);
    }

}
