    // Jeg extender fra Dyre klassen så Hunde klassen får dens attributter og jeg ikke behøver gentage mig selv
public class Hund extends Dyr {
    private boolean vaccineret;

    public Hund(String name, String race, int yearBorn, boolean vaccineret) {
        super(name, race, yearBorn);
        this.vaccineret = vaccineret;
    }
    // Overrider metode fra dyre klassen og får den til at retunere en String
    @Override
    public String soundsItMakes() {
        return "woof";
    }
}