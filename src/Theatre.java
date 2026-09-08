import persons.Actor;
import persons.Director;
import persons.Person;
import shows.Ballet;
import shows.Opera;
import shows.Show;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    public static void main(String[] args) {

        // Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        var actorMichail = new Actor("Михаил", "Боярский", "male", 50);
        var actorVasily = new Actor("Василий", "Сидоров", "male", 40);
        var actorAnna = new Actor("Анна", "Михайлова", "female", 30);

        var directorVasily = new Director("Василий", "Петров", "male", 15);
        var directorIvan = new Director("Иван", "Михайлов", "male", 10);

        var musicAuthorIvan = new Person("Иван", "Кузнецов", "male");
        var choreographerOlga = new Person("Ольга", "Смирнова", "female");

        // Создать три спектакля: обычный, оперный и балет
        var show1 = new Show("Золушка", 100, directorVasily, new ArrayList<>());
        var balet1 = new Ballet(
            "Озеро розовых фламинго", 200, directorIvan, new ArrayList<>(),
            musicAuthorIvan,
            """
            Либретто
            «Озеро розовых фламинго»
            «Pink flamingo lake»
            балет""",
            choreographerOlga);
        var opera1 = new Opera(
            "Травиата", 150, directorIvan, new ArrayList<>(),
            musicAuthorIvan,
            """
            Травиата
            Опера в трёх действиях""",
            3);

        // Распределить актёров по спектаклям.
        // Используйте для этого метод добавления нового актёра в спектакль.
        // Один актёр может участвовать в нескольких спектаклях.
        show1.addActor(actorVasily);

        balet1.addActor(actorVasily);
        balet1.addActor(actorAnna);

        opera1.addActor(actorVasily);
        opera1.addActor(actorMichail);

        // Для каждого спектакля выведите на экран список актёров.
        for (var show : List.of(show1, balet1, opera1)) {
            System.out.println(show.getTitle() + ":");
            show.printActorsData();
            System.out.println("-----------------");
        }
        System.out.println("=================\n");

        // Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        balet1.changeActor(actorVasily, actorMichail);
        System.out.println(balet1.getTitle() + ":");
        balet1.printActorsData();

        System.out.println("=================\n");

        // Попробуйте заменить в другом спектакле несуществующего актёра
        System.out.println(show1.getTitle() + ":");
        show1.changeActor(actorAnna, actorMichail);
        System.out.println("=================\n");

        // Для оперного и балетного спектакля выведите на экран текст либретто.
        System.out.println("Либретто " + balet1.getTitle() + ":");
        balet1.printLibretto();
        System.out.println("-----------------");
        System.out.println("Либретто " + opera1.getTitle() + ":");
        opera1.printLibretto();
        System.out.println("=================");
    }
}
