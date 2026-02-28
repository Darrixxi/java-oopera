import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private String choreographer;

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    public Ballet(String musicAuthor, String librettoText, String title, int duration, Director director, String choreographer, ArrayList<Actor> listOfActors) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choreographer = choreographer;
    }
}
