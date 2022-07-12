package ticketmachine;
import java.util.Random;

public class TicketMachine {

    String badge, start, end;
    int distance, count;

    public TicketMachine() {
        // do nothing?
    }
    public void createTickets(String measurements) {
        String[] radarArr = measurements.split("\n");

        int ttc = 0; // ttc = total transit count
        // empty string init
        String measurementsCleaned = "";
        String badgesOnly = "";
        
        // start the loop
        for (int i = 1; i < radarArr.length; i++) {
            if (!radarArr[i].contains(",")) {
                ttc++;
                // get random
                Random rand = new Random();
                int val = rand.nextInt(4) + 1;
                // 75% situation
                if (val != 1) {
                    String[] radarRowArr = radarArr[i].split(";|,");
                    for (int k = 0; k < radarRowArr.length; k++) {
                        if (k == 0) {
                            badge = radarRowArr[k].trim();
                            badgesOnly = badgesOnly + badge;
                        }
                        if (k == 1) {
                            start = radarRowArr[k].replaceAll("\\s+", "");
                        }
                        if (k == 2) {
                            end = radarRowArr[k].replaceAll("\\s+", "");
                        }
                        if (k == 3) {
                            String distanceRaw = radarRowArr[k].trim();
                            distance = Integer.parseInt(distanceRaw);
                        }
                    }
                    double speed = distance * 3.6;
                    if (speed > 50.0 && !badgesOnly.contains(badge+badge)) {
                        measurementsCleaned = measurementsCleaned +
                        "Car with badge '" + badge + "'" +
                        " was speeding at " + speed +
                        " km/h. Sending a ticket." + "\n" ;                                
                        count++;
                    }
                }
            }
        }
        System.out.println("Total transit count: " +  ttc);
        System.out.println(measurementsCleaned);
        System.out.println("Number of tickets: " + count);
    }
}