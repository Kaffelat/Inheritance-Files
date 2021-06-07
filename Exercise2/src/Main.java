import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Laver 2 objekter, En hund og en cat
        Hund hundeTest = new Hund("fido", "Husky", 2019, true);
        Cat catTest = new Cat(true, "Gitte", "Perser", 2020);
        //kalder deres metoder for at få dem til at sige deres lyd
        System.out.println(hundeTest.soundsItMakes());
        System.out.println(catTest.soundsItMakes());

        //Her prøver jeg at viser at hund og katte klassen er unik og derfor ikke kan være i samme liste medmindre det er en liste for dyre klassen
        ArrayList<Hund> hundePark = new ArrayList<>();
        ArrayList<Cat> catteSpa = new ArrayList<>();
        ArrayList<Dyr> zoologiskhave = new ArrayList<>();

        hundePark.add(hundeTest);
        catteSpa.add(catTest);
        zoologiskhave.add(hundeTest);
        zoologiskhave.add(catTest);


    }
}
