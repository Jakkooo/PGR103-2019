//Class name chosen that they can both be in the same package for the solution here.

public abstract class AnimalUpdated {

    //instance variables
    private String name;
    private String generation;
    private int age;
    private Stable stable;


    //constructors
    public AnimalUpdated() {
    }

    public AnimalUpdated(String name, String generation) {
        this.name = name;
        this.generation = generation;
    }

    public AnimalUpdated(String name, String generation, int age) {
        this.name = name;
        this.generation = generation;
        this.age = age;
    }

    //additional constructor that allows a stable
    public AnimalUpdated(String name, String generation, int age, Stable stable) {
        this.name = name;
        this.generation = generation;
        this.stable = stable;
        this.age = age;
    }


    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //abstract to string method
    public abstract String toString();

}

