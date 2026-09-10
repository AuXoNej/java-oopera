package shows;

import persons.Actor;
import persons.Director;

import java.util.List;

public class Show {

    private String title;
    private Integer duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(
        String title,
        Integer duration,
        Director director,
        List<Actor> listOfActors
    ) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void printActorsData() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void printDirectorData() {
        director.printFullName();
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Актер уже добавлен в спектакль");
        }
    }

    public void changeActor(Actor oldActor, Actor newActor) {
        if (listOfActors.contains(oldActor)) {
            if (listOfActors.contains(newActor)) {
                System.out.println("Новый актер уже есть в спектакле");
                return;
            }

            // Проверяем, что в спектакле нет актера однофамильца,
            // если есть, выводим предупреждение и замену не осуществляем
            if (listOfActors.stream().anyMatch(actor -> actor.getSurname().equals(newActor.getSurname()))) {
                System.out.println(
                    "В спектакле уже есть актер с фамилией " + newActor.getSurname() +", заменить не возможно");
                return;
            };

            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
        } else {
            System.out.println("Актера " + oldActor.getFullName() + " нет в спектакле");
        }
    }

}
