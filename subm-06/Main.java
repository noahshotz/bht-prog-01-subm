public class Main {
    public static int width = 60;
    public static int padding = 3;
    public static String spaceChar = " ";
    public static String borderHorizontalChar = "-";
    public static String borderVerticalChar = "|";
    public static String cornerChar = "+";
    public static String lineBreak = "\n";
    public static String fromName = "$NAME", toName = "$NAME";
    public static String fromAddress = "$ADDRESS", toAddress = "$ADDRESS";
    public static String fromZipCodeAndCity = "$ZIP $CITY", toZipCodeAndCity = "$ZIP $CITY";;

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

    /////////////////// sender ///////////////////
    public static void senderName(String fromName) {
        System.out.print(borderVerticalChar);
        for (int padL = 0; padL < padding; padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(fromName);
        for (int padR = padding + fromName.length(); padR < (width - 2); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void senderAddress(String fromAdress) {
        System.out.print(borderVerticalChar);
        for (int padL = 0; padL < padding; padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(fromAdress);
        for (int padR = padding + fromAdress.length(); padR < (width - 2); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void senderZipCodeAndCity(String fromZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        for (int padL = 0; padL < padding; padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(fromZipCodeAndCity);
        for (int padR = padding + fromZipCodeAndCity.length(); padR < (width - 2); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void senderData(String fromName, String fromAddress, String fromZipCodeAndCity) {
        senderName(fromName);
        senderAddress(fromAddress);
        senderZipCodeAndCity(fromZipCodeAndCity);
    }

    /////////////////// receiver ///////////////////
    public static void toNameisLongest(String toName, String toAddress, String toZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        // name
        for (int padL = padding + toName.length(); padL < (width - 2); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        for (int padR = 0; padR < padding; padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
        // address
        System.out.print(borderVerticalChar);
        for (int padL = padding + toAddress.length(); padL < (width - 2 - (toName.length() - toAddress.length())); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        for (int padR = 0; padR < padding + (toName.length() - toAddress.length()); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
        // zip and city
        System.out.print(borderVerticalChar);
        for (int padL = padding + toZipCodeAndCity.length(); padL < (width - 2 - (toName.length() - toZipCodeAndCity.length())); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        for (int padR = 0; padR < padding + (toName.length() - toZipCodeAndCity.length()); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void toAddressIsLongest(String toName, String toAddress, String toZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        // name
        for (int padL = padding + toName.length(); padL < (width - 2 - (toAddress.length() - toName.length())); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        for (int padR = 0; padR < padding + (toAddress.length() - toName.length()); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
        // address
        System.out.print(borderVerticalChar);
        for (int padL = padding + toAddress.length(); padL < (width - 2); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        for (int padR = 0; padR < padding; padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
        // zip and city
        System.out.print(borderVerticalChar);
        for (int padL = padding + toZipCodeAndCity.length(); padL < (width - 2 - (toAddress.length() - toZipCodeAndCity.length())); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        for (int padR = 0; padR < padding + (toAddress.length() - toZipCodeAndCity.length()); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void toZipCityIsLongest(String toName, String toAdress, String toZipCodeAndCity) {
        System.out.print(borderVerticalChar);
        // name
        for (int padL = padding + toName.length(); padL < (width - 2 - (toZipCodeAndCity.length() - toName.length())); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        for (int padR = 0; padR < padding + (toZipCodeAndCity.length() - toName.length()); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
        // address
        System.out.print(borderVerticalChar);
        for (int padL = padding + toAddress.length(); padL < (width - 2 - (toZipCodeAndCity.length() - toAddress.length())); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        for (int padR = 0; padR < padding + (toZipCodeAndCity.length() - toAddress.length()); padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
        // zip and city
        System.out.print(borderVerticalChar);
        for (int padL = padding + toZipCodeAndCity.length(); padL < (width - 2); padL++) {
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        for (int padR = 0; padR < padding; padR++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public static void receiverData(String toName, String toAddress, String toZipCodeAndCity) {
        if (toName.length() > toAddress.length() && toName.length() > toZipCodeAndCity.length()) {
            toNameisLongest(toName, toAddress, toZipCodeAndCity);
        } else if (toAddress.length() > toName.length() && toAddress.length() > toZipCodeAndCity.length()) {
            toAddressIsLongest(toName, toAddress, toZipCodeAndCity);
        } else {
            toZipCityIsLongest(toName, toAddress, toZipCodeAndCity);
        }
    }

    public static void main(String[] args) {
        printEnvelope(
                "Max Mustermann", "Mustertr. 42", "14242 Musterstadt",
                "Anna Alt", "Spass-Str. 123", "13353 Berlin");
        printEnvelope(
                "Max Mustermann", "Mustertr. 42",
                "Anna Alt", "Spass-Str. 123");
        printEnvelope(
                "Max Mustermann",
                "Anna Alt");
        printEnvelope();
    }

    public static void printEnvelope() {
        header();
        emptyLine();
        senderData(fromName, fromAddress, fromZipCodeAndCity);
        emptyLine();
        receiverData(toName, toAddress, toZipCodeAndCity);
        emptyLine();
        header();
    }

    public static void printEnvelope(String fromName, String toName) {
        header();
        emptyLine();
        senderData(fromName, fromAddress, fromZipCodeAndCity);
        emptyLine();
        receiverData(toName, toAddress, toZipCodeAndCity);
        emptyLine();
        header();
    }

    public static void printEnvelope(String fromName, String fromAddress, String toName, String toAddress) {
        header();
        emptyLine();
        senderData(fromName, fromAddress, fromZipCodeAndCity);
        emptyLine();
        receiverData(toName, toAddress, toZipCodeAndCity);
        emptyLine();
        header();
    }

    public static void printEnvelope(String fromName, String fromAddress, String fromZipCodeAndCity, String toName,
            String toAddress, String toZipCodeAndCity) {
        header();
        emptyLine();
        senderData(fromName, fromAddress, fromZipCodeAndCity);
        emptyLine();
        receiverData(toName, toAddress, toZipCodeAndCity);
        emptyLine();
        header();
    }
}