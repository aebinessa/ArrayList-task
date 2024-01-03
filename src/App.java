import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<String> songs = new ArrayList<>();

        songs.add("Runaway");
        songs.add("NY State Of mind");
        songs.add("It ain't Hard to tell");
        songs.add("Ain't No Fun"); // if the homies cant have none...
        songs.add("Good Kid");

        songs.remove(2);

        for (String song : songs) {

            System.out.println(song);
            ////////

        }

    }
}
