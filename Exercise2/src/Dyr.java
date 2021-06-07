    //Der bliver lavet en abstact klasse som andre klasser kan nedarve fra
public abstract class Dyr {
    private String name;
    private String race;
    private int yearBorn;
    // En constructer til Dyre klassen
    public Dyr(String name, String race, int yearBorn){
        this.name = name;
        this.race = race;
        this.yearBorn = yearBorn;
    }
    // Denne metode gør at når andre klasser nedarver fra denne kan man overide den så man kan lave den unik for hver klasse
    public abstract String soundsItMakes();

}
