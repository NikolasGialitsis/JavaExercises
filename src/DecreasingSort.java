/*
Γράψε ένα πρόγραμμα που να ζητά 10 νούμερα και να τα εκυπώνει σε φθίνουσα σειρά
 */


import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class DecreasingSort {

    public DecreasingSort(){
        Scanner scan = new Scanner(System.in);
        Integer[] array;
        array = new Integer[10];

        for(int i = 0 ; i < 10 ; i++){
            System.out.print("Please give me a number:");
            while(!scan.hasNextLine()){};
            System.out.println();
            array[i] = Integer.parseInt(scan.nextLine());
        }
        Arrays.sort(array, Collections.reverseOrder());
        for(Integer myint :array){
            System.out.println(myint);
        }
    }

}
