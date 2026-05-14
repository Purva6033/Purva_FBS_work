
class Artist {
    protected String name;
    protected int age;

    Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void perform() {
        System.out.println("Artist Performing");
    }
}

class Painter extends Artist {
    String paintingStyle;
    String mediumUsed;
    int numberOfPaintings;

    Painter(String name, int age,
             String paintingStyle,
             String mediumUsed,
             int numberOfPaintings) {

        super(name, age);

        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }
    void perform() {
        System.out.println(name
                + " is Painting");
    }
}

class Musician extends Artist {
    String instrument;
    String musicGenre;
    int numberOfAlbums;

    Musician(String name, int age,
             String instrument,
             String musicGenre,
             int numberOfAlbums) {

        super(name, age);

        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }
    void perform() {
        System.out.println(name
                + " is Playing Music");
    }
}

class Actor extends Artist {
    String filmIndustry;
    int numberOfMovies;

    Actor(String name, int age,
          String filmIndustry,
          int numberOfMovies) {

        super(name, age);

        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }
    void perform() {
        System.out.println(name
                + " is Acting");
    }
}
public class ArtistMain {

    public static void main(String[] args) {

        Artist a;

        a = new Painter("Aman", 0, null, null, 0);
        a.perform();

        a = new Musician("Arijit", 0, null, null, 0);
        a.perform();

        a = new Actor("Shahrukh", 0, null, 0);
        a.perform();
    }
}