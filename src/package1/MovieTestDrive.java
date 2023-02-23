package package1;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie m = new Movie();

        m.genre = "Horror";
        m.rating = 8;
        m.title = "Exorcist";

        System.out.println(m.genre);
        System.out.println(m.rating);
        System.out.println(m.title);    
        m.playIt();
    }
}

class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}