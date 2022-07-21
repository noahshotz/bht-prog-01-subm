public class Berechnen {
    public int basispreis = 10;
    public String wohnort = "$DEFAULT";
    public String versandart = "normal";
    public int gesamtpreis = 0;

    public Berechnen() {
        this.gesamtpreis = basispreis;
    }

    public Berechnen(String wohnort) {
        this.wohnort = wohnort;
        if (wohnort.equalsIgnoreCase("Brandenburg")) {
            this.gesamtpreis = basispreis + 5;
        }
    }

    public Berechnen(String wohnort, String versandart) {
        this.wohnort = wohnort;
        if (wohnort.equalsIgnoreCase("Brandenburg")) {
            this.gesamtpreis = basispreis + 5;
        }
        this.versandart = versandart;
        if (versandart.equalsIgnoreCase("express")) {
            this.gesamtpreis = gesamtpreis + 20;
        }
    }
}