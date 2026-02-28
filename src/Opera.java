import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    public Opera(String title, int duration, Director director, String musicAuthor,
                 String librettoText, int choirSize, ArrayList<Actor> listOfActors) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choirSize = choirSize;
    }
}
