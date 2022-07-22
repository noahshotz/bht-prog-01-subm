public class Flugzeug {
    // Attribut
    protected String name = "";

    // Konstruktor
    public Flugzeug(String name) {
        this.name = name;
    }

    // Methoden
    public String getName() {
        return name;
    }

    public String toString() {
        String returnString = "Flugzeug Name: " + name;
        return returnString;
    }
}