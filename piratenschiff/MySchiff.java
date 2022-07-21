public class MySchiff {
    private static String name = ""; //name piratensschiff
    private static int anzahl = 0; // anzahl piraten
    private static double weight = 0.0; //gewicht gold muenzen

public MySchiff(String name, int anzahl, double weight){ //konstruktor
    MySchiff.name = name;
    MySchiff.anzahl = anzahl;
    MySchiff.weight = weight;
}
public String getName() {
    return name;
}
public int getAnzahl() {
    return anzahl;
}
public double getWeight() {
    return weight;
}
public void setName(String name) {
    MySchiff.name = name;
}
public void setAnzahl(int anzahl) {
    MySchiff.anzahl = anzahl;
}
public void setWeight(double Weight) {
    // MySchiff.weight = weight;
}
public String toString(){
    return " Name des Schiffes: " + name
    + " Anzahl der Piraten: " + anzahl
    + "Gewicht der Goldmuenzen" + weight;
}

public void pluendern(double g) { //pluendern methode
    weight += g;

    if (weight > 50.0) {
        System.out.print("Arrr!! " + weight);
    }
    else {
        System.out.print("MORE GOLD!!!");
    }
}
}
