import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] namesarr = {
                "Carla Cantor",
                "Bob Berg",
                "Daniel Dorf",
                "Anna Apfel",
                "Anna Alt",
                "Daniel Dinkel",
                "Bob Birke",
                "Bob Buche"
        };

        Arrays.sort(namesarr);
        String usedLetters = "";
        for (int i = 0; i < namesarr.length; i++) {
            if (!usedLetters.contains(namesarr[i].substring(0, 1))) {
                usedLetters = usedLetters + namesarr[i].substring(0, 1);
                System.out.println(namesarr[i]);
            }
        }
    }
}