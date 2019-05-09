public class TestAnimal {
    //Test class for the animals


    //beginning of the program through public static void main.
    public static void main(String[] args) {

        //create a stable
        Stable goatStable = new Stable("Ekeberg parken", "Box 5", "Ekeberg EKT");

        System.out.println(goatStable.toString());
        System.out.println();

        //create the animals
        Animal myLion = new Lion("Herbert", "third", 25);
        AnimalUpdated myGoat = new GoatUpdated("Lisi", "second", 13, "brainz", goatStable);

        //print the toStrings
        System.out.println(myLion.toString());
        System.out.println(myGoat.toString());

        //test the feeding
        System.out.println(((GoatUpdated) myGoat).feedAnimal("leaves"));
        System.out.println(((GoatUpdated) myGoat).feedAnimal("brainz"));

    }



}
