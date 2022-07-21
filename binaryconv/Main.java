public class Main {
    public static void main(String[] args) {

        // input binary str
        String binaryStr = "0101";
        // reverse binary str
        String invBinaryStr = new StringBuilder(binaryStr).reverse().toString();
        // str to array
        String[] binArr = invBinaryStr.split("");
        
        int dezimalzahl = 0;
        for(int i = 0; i < binArr.length; i++) {
            if (binArr[i].equals("1")) {
                dezimalzahl = dezimalzahl + (int) Math.pow(2,i);
            }
        }
        System.out.println("Dezimalzahl: " + dezimalzahl);
    }
}
