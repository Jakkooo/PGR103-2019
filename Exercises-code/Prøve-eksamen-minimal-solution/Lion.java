public class Lion extends Animal {

    //getter and setters
    public Lion() {
    }

    public Lion(String name, String generation) {
        super(name, generation);
    }

    public Lion(String name, String generation, int age) {
        super(name, generation, age);
    }

    //overriden to string
    @Override
    public String toString() {
        return "My name is " + this.getName() + ", " + this.getGeneration() +  " of my name, and I am " + this.getAge() +".";
    }

}
