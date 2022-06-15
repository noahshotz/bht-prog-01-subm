public class Envelope {

    public static int width = 60;
    public static int border = 2;
    public static int padding = 3;

    public static String spaceChar = " ";
    public static String borderHorizontalChar = "-";
    public static String borderVerticalChar = "|";
    public static String cornerChar = "+";
    public static String lineBreak = "\n";

    public static String fromName = "BHT Berlin";
    public static String fromAddress = "Luxemburger Str. 10";
    public static String fromZipCodeAndCity = "13353 Berlin";

    public static void header() {
        System.out.print(cornerChar);
        for (int wH = 0; wH < (width - 2); wH++) {
            System.out.print(borderHorizontalChar);
        }
        System.out.print(cornerChar + lineBreak);
    }

    public static void emptyLine() {
        System.out.print(borderVerticalChar);
        for (int wS = 0; wS < (width - 2); wS++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void senderData(String fromName, String fromAddress, String fromZipCodeAndCity) {
        printSenderName(fromName);
        printSenderAddress(fromAddress);
        printSenderZipCodeAndCity(fromZipCodeAndCity);
    }
    
    public static void printSenderName(String fromName) {
        System.out.print(borderVerticalChar);
        for (int i = 0; i < padding; i++) {
            System.out.print(spaceChar);
        }
        System.out.print(fromName);
        for (int i = padding + fromName.length(); i < (width - 2); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void printSenderAddress(String fromAdress) {
        System.out.print(borderVerticalChar);
        for (int i = 0; i < padding; i++) {
            System.out.print(spaceChar);
        }
        System.out.print(fromAdress);
        for (int i = padding + fromAdress.length(); i < (width - 2); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void printSenderZipCodeAndCity(String fromZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        for (int i = 0; i < padding; i++) {
            System.out.print(spaceChar);
        }
        System.out.print(fromZipCodeAndCity);
        for (int i = padding + fromZipCodeAndCity.length(); i < (width - 2); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
    }
    
    public static void receiverData(String toName, String toAddress, String toZipCodeAndCity) {
        if (toName.length() > toAddress.length() && toName.length() > toZipCodeAndCity.length()) {
            toNameIsLongest(toName, toAddress, toZipCodeAndCity);
        } else if (toAddress.length() > toName.length() && toAddress.length() > toZipCodeAndCity.length()) {
            toAddressIsLongest(toName, toAddress, toZipCodeAndCity);
        } else {
            toZipCodeAndCityIsLongest(toName, toAddress, toZipCodeAndCity);
        }
    }
    
    public static void toNameIsLongest(String toName, String toAddress, String toZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        for (int i = padding + toName.length(); i < (width - 2); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        for (int i = 0; i < padding; i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
        System.out.print(borderVerticalChar);
        for (int i = padding + toAddress.length(); i < (width - 2 - (toName.length() - toAddress.length())); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        for (int i = 0; i < padding + (toName.length() - toAddress.length()); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
        System.out.print(borderVerticalChar);
        for (int i = padding + toZipCodeAndCity.length(); i < (width - 2 - (toName.length() - toZipCodeAndCity.length())); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        for (int i = 0; i < padding + (toName.length() - toZipCodeAndCity.length()); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
    }

    public static void toAddressIsLongest(String toName, String toAddress, String toZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        for (int i = padding + toName.length(); i < (width - 2 - (toAddress.length() - toName.length())); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        for (int i = 0; i < padding + (toAddress.length() - toName.length()); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
        System.out.print(borderVerticalChar);
        for (int i = padding + toAddress.length(); i < (width - 2); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        for (int i = 0; i < padding; i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
        System.out.print(borderVerticalChar);
        for (int i = padding + toZipCodeAndCity.length(); i < (width - 2 - (toAddress.length() - toZipCodeAndCity.length())); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        for (int i = 0; i < padding + (toAddress.length() - toZipCodeAndCity.length()); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void toZipCodeAndCityIsLongest(String toName, String toAddress, String toZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        for (int i = padding + toName.length(); i < (width - 2 - (toZipCodeAndCity.length() - toName.length())); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        for (int i = 0; i < padding + (toZipCodeAndCity.length() - toName.length()); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
        System.out.print(borderVerticalChar);
        for (int i = padding + toAddress.length(); i < (width - 2 - (toZipCodeAndCity.length() - toAddress.length())); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        for (int i = 0; i < padding + (toZipCodeAndCity.length() - toAddress.length()); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak); 
        System.out.print(borderVerticalChar);
        for (int i = padding + toZipCodeAndCity.length(); i < (width - 2); i++) {
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        for (int i = 0; i < padding; i++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public void printEnvelope(Student[] toStudents) {
        for(int i = 0; i < toStudents.length; i++){    
            header();
            emptyLine();
            senderData(fromName, fromAddress, fromZipCodeAndCity);
            emptyLine();
            receiverData(toStudents[i].getName(),
                         toStudents[i].getAddress(),
                         toStudents[i].getZipCodeAndCity());
            emptyLine();
            header();
        }
    }
}