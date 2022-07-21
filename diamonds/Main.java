public class Main {
    static int diamondSize = 5;

    public static void main(String args[]) {

        // top half of diamond
        for (int i = 0; i <= diamondSize; i++) {
            if (i % 2 != 0) {
                printDiamond(i);
            }
        }

        // bottom half of diamond
        for (int i = diamondSize; i >= 0; i--) {
            if (i % 2 != 0) {
                printDiamond(i);
            }
        }
    }

    public static void printDiamond(int i) {
        int x = (diamondSize - i) / 2;
        for (int z = 0; z <= x; z++) {
            System.out.print(" ");
        }
        for (int y = 0; y <= i - 1; y++) {
            System.out.print("*");
        }
        for (int z = 0; z <= x; z++) {
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}