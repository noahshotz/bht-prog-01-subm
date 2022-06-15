public class Envelope {
    int width = 60;
    int padding = 3;
    String spaceChar = " ";
    String borderHorizontalChar = "-";
    String borderVerticalChar = "|";
    String cornerChar = "+";
    String lineBreak = "\n";

    String fromName = "BHT Berlin";
    String fromAddress = "Luxemburger Str. 10";
    String fromZipCodeAndCity = "13353 Berlin";

    String toName = "$NAME";
    String toAddress = "$ADDRESS";
    String toZipCodeAndCity = "$ZIP $CITY";
    
    // padding generator
    public void padding(){
        for (int x = 0; x < padding; x++) {
            System.out.print(spaceChar);
        }
    }

    // print upper and lower limit
    public void printBorder() {
        System.out.print(cornerChar);
        for (int x = 0; x < width - 2; x++) {
            System.out.print(borderHorizontalChar);
        }
        System.out.print(cornerChar + lineBreak);
    }

    public void emptyLine() {
        System.out.print(borderVerticalChar);
        for (int x = 0; x < width - 2; x++) {
            System.out.print(spaceChar);
        }
        System.out.print(borderVerticalChar + lineBreak);
    }

    public void senderData() {
        // from name
        System.out.print(borderVerticalChar);
        padding();
        System.out.print(fromName);
        for (int x = 0; x < width - (2*padding) - fromName.length() - 2; x++){
            System.out.print(spaceChar);
        }
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        // from adddress
        System.out.print(borderVerticalChar);
        padding();
        System.out.print(fromAddress);
        for (int x = 0; x < width - (2*padding) - fromAddress.length() - 2; x++){
            System.out.print(spaceChar);
        }
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        //from fromZipCodeAndCity
        System.out.print(borderVerticalChar);
        padding();
        System.out.print(fromZipCodeAndCity);
        for (int x = 0; x < width - (2*padding) - fromZipCodeAndCity.length() - 2; x++){
            System.out.print(spaceChar);
        }
        padding();
        System.out.print(borderVerticalChar + lineBreak);
    }

    public void strTest(String toName) {
        System.out.println("");
        System.out.println("Test: " + toName);
        System.out.println("");
    }

    public void receiverData() {
        if (toName.length() > toAddress.length() && toName.length() > toZipCodeAndCity.length()) {
            toNameIsLongest();
        } else if (toAddress.length() > toName.length() && toAddress.length() > toZipCodeAndCity.length()) {
            toAddressIsLongest();
        } else if (toZipCodeAndCity.length() > toAddress.length() && toZipCodeAndCity.length() > toName.length()) {
            toZipCodeAndCityIsLongest();
        }
    }

    public void toNameIsLongest(String toName, String toAddress, String toZipCodeAndCity) {
        // from name
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toName.length() - 2; x++){
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        // from adddress
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toAddress.length() - 2; x++){
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        //from fromZipCodeAndCity
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toZipCodeAndCity.length() - 2; x++){
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        padding();
        System.out.print(borderVerticalChar + lineBreak);
    }

    public void toAddressIsLongest() {
        // from name
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toName.length() - 2; x++){
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        // from adddress
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toAddress.length() - 2; x++){
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        //from fromZipCodeAndCity
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toZipCodeAndCity.length() - 2; x++){
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        padding();
        System.out.print(borderVerticalChar + lineBreak);
    }

    public void toZipCodeAndCityIsLongest() {
        // from name
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toName.length() - 2 - (toZipCodeAndCity.length() - toName.length()); x++){
            System.out.print(spaceChar);
        }
        System.out.print(toName);
        for (int x = 0; x < (toZipCodeAndCity.length() - toName.length()); x++) {
            System.out.print(spaceChar);
        }
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        // from adddress
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toAddress.length() - 2 - (toZipCodeAndCity.length() - toAddress.length()); x++){
            System.out.print(spaceChar);
        }
        System.out.print(toAddress);
        for (int x = 0; x < (toZipCodeAndCity.length() - toAddress.length()); x++) {
            System.out.print(spaceChar);
        }
        padding();
        System.out.print(borderVerticalChar + lineBreak);

        //from fromZipCodeAndCity
        System.out.print(borderVerticalChar);
        padding();
        for (int x = 0; x < width - (2*padding) - toZipCodeAndCity.length() - 2; x++){
            System.out.print(spaceChar);
        }
        System.out.print(toZipCodeAndCity);
        padding();
        System.out.print(borderVerticalChar + lineBreak);
    }

    public void printEnvelope(Student[] toStudents) {
        printBorder();
        emptyLine();
        senderData();
        emptyLine();
        receiverData();
        emptyLine();
        printBorder();
    }
}