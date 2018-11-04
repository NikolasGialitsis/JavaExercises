public class Ampersand {

    public Ampersand(){

        String a;
        a = "";
        boolean in_loop = false;
        if((!a.isEmpty())& a.length()>10){
            System.out.println("In loop");
            in_loop = true;
        }
        if(in_loop == false){
            System.out.println("Condition always false");
        }
    }
}
