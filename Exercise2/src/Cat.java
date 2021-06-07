    // Jeg extender fra Dyre klassen så katte klassen får dens attributter og jeg ikke behøver gentage mig selv
public class Cat extends Dyr{
    private boolean isItAngry;

    public Cat(boolean isItAngry, String name, String race, int yearBorn){
        super(name, race, yearBorn);
        this.isItAngry = isItAngry;
    }
    // Overrider metode fra dyre klassen og får den til at retunere en String
    @Override
    public String soundsItMakes(){
        return "meow";
    }
}
