package persons;

import java.util.Objects;

public class Actor extends Person {

    private Integer height;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;
        return Objects.equals(super.getName(), actor.getName())
            && Objects.equals(super.getSurname(), actor.getSurname())
            && Objects.equals(super.getGender(), actor.getGender())
            && Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;

        if (super.getName() != null) {
            hash = hash + super.getName().hashCode();
        }
        hash = hash * 31;

        if (super.getSurname() != null) {
            hash = hash + super.getSurname().hashCode();
        }
        hash = hash * 31;
        if (super.getGender() != null) {
            hash = hash + super.getGender().hashCode();
        }
        hash = hash * 31;
        if (height != null) {
            hash = hash + height.hashCode();
        }

        return hash;
    }

    public Actor(
        String name, String surname, String gender, Integer height
    ) {
        super(name, surname, gender);
        this.height = height;
    }

    public String getDataActor() {
        return super.getName() + " " + super.getSurname() + " (" + this.height + ")";
    }
}
