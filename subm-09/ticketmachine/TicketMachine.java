package ticketmachine;

import java.util.Random;

public class TicketMachine {

    String badge, start, end;
    int distance;

    public TicketMachine() {
        // do nothing?
    }

    public void createTickets(String measurements) {
        String[] testdata = measurements.split("\n");

        // return total transit count
        System.out.println("Total transit count: " + (testdata.length - 1)); // -1 to remove header row

        for (int i = 1; i < testdata.length; i++) {
            // get random
            Random rand = new Random();
            int val = rand.nextInt(4) + 1;
            if (val == 1) {
                System.out.println("You have not been busted today, Mr " + i);
            } else {
                String[] testmes = testdata[i].split(";|,");
                for (int k = 0; k < testmes.length; k++) {
                    if (k == 0) {
                        badge = testmes[k].trim();
                    }
                    if (k == 1) {
                        start = testmes[k].replaceAll("\\s+", "");
                    }
                    if (k == 2) {
                        end = testmes[k].replaceAll("\\s+", "");
                    }
                    if (k == 3) {
                        String distanceRaw = testmes[k].trim();
                        distance = Integer.parseInt(distanceRaw);
                    }
                }

                System.out.println(
                        "Car with badge " + badge + 
                        " was speeding at " + (distance * 3.6) +        // implement method for speed calculation 
                        "km/h. Sending a ticket.");
            }
        }
    }
}