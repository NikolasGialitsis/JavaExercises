/*
Γράψε ένα εκτελέσιμο που να διαβάζει ένα αρχείο μισθοδοσίας της μορφής:
Γιώργος
Γιαννακόπουλος
2000
Κώστας
Κωστόπουλος
4200
Γιάννης
Γεωργακόπουλος
1200
(κ.ο.κ)
και να βγάζει το άθροισμα των μισθών των ανθρώπων (είναι τα νούμερα στα δεδομένα),ομαδοποιώντας τους
με βάση το πρώτο γράμμα του ονόματός τους και το πρώτο γράμμα του επωνύμου:

ΓΓ: 3200
ΚΚ: 4200
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Payments {

    public Payments() throws FileNotFoundException {

        HashMap<String,Integer> hashMap = new HashMap<>();
        File input = new File("/root/IdeaProjects/JavaExercises/src/payments.dat");
        Scanner scan = new Scanner(input);
        while (scan.hasNextLine()){
            String name = scan.nextLine();
            String surname = scan.nextLine();
            int payment = Integer.parseInt(scan.nextLine());
            String key = "";
            key += name.charAt(0);
            key += surname.charAt(0);
            if(hashMap.containsKey(key)) {
                hashMap.put(key, payment + hashMap.get(key));
            }
            else{
                hashMap.put(key, payment);
            }
        }

        for (String key: hashMap.keySet()){
            int value = hashMap.get(key);
            System.out.println(key + " : " + value);
        }

    }
}
