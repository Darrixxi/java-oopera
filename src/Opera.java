import java.util.ArrayList;

public class Opera extends MusicalShow{
    protected int choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor, String librettoText, int choirSize, ArrayList<Actor> listOfActors) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choirSize = choirSize;
    }
}
