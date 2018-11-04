
/*
    This class implements the factorial of a number.eg
    5! = 1 * 2 * 3 * 4 * 5

 */
public class Factorial {
    //Constructor
    public Factorial(int numb){
       System.out.println("Result = "+calcFactorial(numb));
    }

    //Default Constructor
    public Factorial(){
        System.out.println("Result = "+calcFactorial(5));
    }

    //Factorial calculation via recursive calls
    private int calcFactorial(int numb){

        if (numb == 1)return numb;

        System.out.println(numb +" * "+(numb-1));
        return numb*calcFactorial(numb-1);
    }






}
