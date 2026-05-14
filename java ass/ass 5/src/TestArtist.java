
class Artist {
    protected String name;
    protected int age;

    Artist(String name, int age) {
        this.name = name;
        this.age = age;
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
}