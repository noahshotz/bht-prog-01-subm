package ticketmachine;

//import java.time.LocalDateTime;
//import java.time.temporal.ChronoUnit;
import java.util.Random;

public class TicketMachine {

    String badge, start, end;
    int distance, count;

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
            //System.out.println("random val:" + val);
            // 75% situation
            if (val != 1) { 
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

                //LocalDateTime tStart = LocalDateTime.parse(start);
                //LocalDateTime tEnd = LocalDateTime.parse(end);
                //long seconds = ChronoUnit.SECONDS.between(tStart, tEnd);
                //long speed = distance / seconds;
                double speed = distance * 3.6;

                if (speed > 50.0) {
                    System.out.println(
                            "Car with badge " + badge +
                                    " was speeding at " + speed +
                                    " km/h. Sending a ticket.");
                    count++;
                }
            }
        }
        System.out.println("Number of tickets: " + count);
    }
}