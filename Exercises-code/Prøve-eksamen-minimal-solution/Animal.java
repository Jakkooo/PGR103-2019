public abstract class Animal {

    //instance variables
    private String name;
    private String generation;
    private int age;


    //constructors
    public Animal() {
    }

    public Animal(String name, String generation) {
        this.name = name;
        this.generation = generation;
    }


    public Animal(String name, String generation, int age) {
        this.name = name;
        this.generation = generation;
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
