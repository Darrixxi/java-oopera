import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void addActor(Actor actor) {
        if(!listOfActors.contains(actor)){
            listOfActors.add(actor);
        } else {
            System.out.println("Такой актер уже добавлен!");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с такой фамилией не найден.");
    }


    public void printListActor() {
        for(Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }
}
