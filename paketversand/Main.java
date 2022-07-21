/**
 * Main class of the Java program.
 */
public class Main {

    public static void main(String[] args) {
        Berechnen paket1 = new Berechnen();
        System.out.println("Gesamtpreis: " + paket1.gesamtpreis + " EUR");

        Berechnen paket2 = new Berechnen("Brandenburg");
        System.out.println("Gesamtpreis: " + paket2.gesamtpreis + " EUR");

        Berechnen paket3 = new Berechnen("Brandenburg", "Express");
        System.out.println("Gesamtpreis: " + paket3.gesamtpreis + " EUR");
    }
}
