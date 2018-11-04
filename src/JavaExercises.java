import java.io.FileNotFoundException;

//This class runs all exercises with default parameters
public class JavaExercises {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("------ Running factorial -----");
        new Factorial();

        System.out.println("------ Running payments ------ ");
        new Payments();

        System.out.println("------ Running DecreasingSort ------ ");
        new DecreasingSort();

        System.out.println("------ Running PingPong ------ ");
        new PingPong();

        System.out.println("------ Running Ampersand ------ ");
        new Ampersand();
    }




}
