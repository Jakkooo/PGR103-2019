public class GoatUpdated extends AnimalUpdated implements Feedable {


    //instance variables
    private String favoriteFood;


    //Constructors

    public GoatUpdated() {
    }

    public GoatUpdated(String name, String generation) {
        super(name, generation);
    }

    public GoatUpdated(String name, String generation, int age) {
        super(name, generation, age);
    }

    public GoatUpdated(String name, String generation, int age, String favoriteFood) {
        super(name, generation, age);
        this.favoriteFood = favoriteFood;
    }

    public GoatUpdated(String name, String generation, int age, String favoriteFood, Stable stable) {
        super(name, generation, age, stable);
        this.favoriteFood = favoriteFood;
    }

    //getter and setter methods
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "My name is " + this.getName() + ", " + this.getGeneration() + " of my name, and I am " + this.getAge() + ". I am pleased if you feed me " + this.favoriteFood + ".";
    }

    @Override
    public String feedAnimal(String food) {
        if (food.equals(favoriteFood))
            return "Right food. Mhhh that was good!";
        else return "Wrong food. Goat stanger deg!";
    }

}
