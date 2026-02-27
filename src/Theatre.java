import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Кирилл", "Иванов", Gender.MALE, 175);
        Actor actor2 = new Actor("Иван", "Павлов", Gender.MALE, 180);
        Actor actor3 = new Actor("Екатерина", "Серябкина", Gender.FEMALE, 165);

        Director director1 = new Director("Кирилл", "Петров", Gender.MALE, 3);
        Director director2 = new Director("Петр", "Селезнев", Gender.MALE, 4);

        String musicAuthor = "Иванов Антон";
        String choreographer = "Бородин Максим";

        Show show = new Show("спектакль", 120, director1, new ArrayList<>());
        Opera opera = new Opera("Опера", 60, director1, musicAuthor,
                "текст либретто оперы", 2, new ArrayList<>());
        Ballet ballet = new Ballet(musicAuthor, "текст либретто балета", "балет",
                120, director2, choreographer, new ArrayList<>());

        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Актёры обычного спектакля:");
        show.printListActor();
        System.out.println("\nАктёры оперного спектакля:");
        opera.printListActor();
        System.out.println("\nАктёры балета:");
        ballet.printListActor();


        show.replaceActor(new Actor("Никита", "Пушкин", Gender.MALE, 173), "Павлов");
        System.out.println("\nПосле замены актёра в обычном спектакле:");
        show.printListActor();

        show.replaceActor(new Actor("Паша", "Белкин", Gender.FEMALE, 176), "Павлов");

        ballet.printLibretto();
        opera.printLibretto();
    }
}

