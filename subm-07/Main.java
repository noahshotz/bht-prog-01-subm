public class Main {

    public static void main(String[] args) {

        Envelope envelope = new Envelope();

        Student s1 = new Student("John", "Doe", "Doestreet", "42", "12212", "Fancytown", "2323232", "Medieninformatik");
        Student s2 = new Student("Bessie", "Clemente", "Wilson Avenue", "40", "75081", "Texas", "63453", "Medieninformatik");

        String toName = s1.getFullName();
        String toAddress = s1.getFullAddress();
        String toZipCodeAndCity = s1.getFullZipCodeAndCity();

        envelope.printBorder();
        envelope.emptyLine();
        envelope.toNameIsLongest(toName, toAddress, toZipCodeAndCity);

        //envelope.printEnvelope(new Student[] { s1 });
        //envelope.printEnvelope(new Student[] { s1, s2 });

    }
}