public class MyClass {
    public static void main(String args[]) {
        String words[] = {"Sonne", "Mond", "Stern", "PARTYS", "CHILLEN", "TANZEN", "Apfel", "Birne", "Sanddorn"};

        for (int x = 0; x < words.length; x++) {
            String currentIndex = words[x];
            if (currentIndex.substring(currentIndex.length() - 1).equalsIgnoreCase("n")) {
                System.out.println(x);
            }
        }
    }
}