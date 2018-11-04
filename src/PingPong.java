
/*
Γράψε ένα πρόγραμμα που να εκτυπώνει τους αριθμούς από το 1 έως το 100.Αν ο αριθμός είναι πολλαπλάσιος του 3,γράψε
δίπλα του Ping.Αν είναι του 5, Pong.Αν είναι πολλαπλάσιο και του 3 και του 5 , τότε Pang.
 */


public class PingPong {

    public PingPong(){

        for(int i = 1 ; i < 101 ; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println(i + "\t : Pang");
            else if (i % 3 == 0)
                System.out.println(i + "\t : Ping");
            else if (i % 5 == 0)
                System.out.println(i + "\t : Pong");
            else
                System.out.println(i);
        }

    }


}
