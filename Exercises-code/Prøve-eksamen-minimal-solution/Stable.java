public class Stable {

    //instance variables
    private String location;
    private String box;
    private String farm;

    //constructors
    public Stable() {
    }

    public Stable(String location, String box, String farm) {
        this.location = location;
        this.box = box;
        this.farm = farm;
    }

    //getter and setter methods
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }


    public String toString(){
        return "Location: "+ this.location +"\nBox: "+ this.box +"\nFarm: " + farm;
    }

}
