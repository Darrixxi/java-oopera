import java.util.ArrayList;

public class MusicalShow extends Show{
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String musicAuthor, String librettoText, String title, int duration, Director director) {
        super(title, duration, director, new ArrayList<>());
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
