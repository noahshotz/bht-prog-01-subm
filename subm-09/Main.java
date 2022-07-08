import ticketmachine.*;

public class Main {
    public static void main(String [] args) {
        String input = 
            "badge     ; start               ; end                 ; distance\n"
          + "D-HF 2345 ; 2000-01-23T11:22:33 ; 2000-01-23T12:22:33 ; 1000\n"
          + "B-AT 6724 ; 2001-03-12T00:00:00 ; 2001-03-12T00:01:00 ; 800\n"
          + "B-KE 6724 ; 2012-01-08T15:22:04 ; 2012-01-08T15:22:44 ; 800\n"
          + "B-HE 332  ; 2012-08-08T15:22:04 ; 2012-08-08T15:22:44 ; 800\n"
          + "G-AT 3343 ; 2012-12-22T15:22:04 ; 2012-12-22T15:22:44 ; 800\n"
          + "H-HF 8373 ; 2013-01-08T15:22:04 ; 2013-01-08T15:22:44 ; 800\n"
          + "Q-AT 9926 ; 2012-01-15T15:22:04 ; 2012-01-15T15:22:44 ; 800\n"
          + "L-AT 4834 ; 2018-02-08T15:22:04 ; 2018-02-08T15:22:44 ; 800\n"
          + "F-FT 9335 , 2012-01-08T15:22:04 , 2012-01-08T15:22:44 ; 800"  // wrong delimiter (command instead of semicolon)
          + "\n"                                                           // extra line
          ;
          
        TicketMachine tm = new TicketMachine();
        tm.createTickets(input);
    }
    
}