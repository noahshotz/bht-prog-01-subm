public class Airbus extends Flugzeug {
    int sitze;

    public int getSitze() {
        return sitze;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public Airbus(String name) {
        super(name);
    }

    public String toString() {
        return "Flugzeug Name: " + this.name + ", Anzahl der Sitze: " + this.sitze;
    }

    public Airbus compareTo(Airbus airbus) {
        //Vergleiche Sitze
        if (airbus.getSitze() > this.getSitze()) return airbus;
        else if (airbus.getSitze() < this.getSitze()) return this;
        //Vergleiche Name
        else {
            //Geht davon aus, dass der Name nur ein Bustabe ist.
            if (airbus.getName().charAt(0) >= this.getName().charAt(0)) return airbus;
            else return this;
        }
    }
}