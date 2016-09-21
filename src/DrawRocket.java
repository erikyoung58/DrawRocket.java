/**
 * Created by ecyou on 9/19/2016.
 * this is a program that contains multiple functions which are called to create a desired
 * output which is a rocket
 */
public class DrawRocket {

//this is the declared constant
    public static final int SIZE = 3;

//    this is the main where all the main modules that contain the for loops are called
    public static void main(String[] args) {
        cone();
        breaker();
        tdiamondbox();
        bdiamondbox();
        breaker();
        bdiamondbox();
        tdiamondbox();
        breaker();
        cone();
    }

//this function contains a for loop that print out slashes that increase iteration
// that is frequently used in a couple modules
    public static void slashes(int p){
        for (int r=1; r<=p; r++){
            System.out.print("/\\");
        }
    }

//    this function contains a for loop that prints either a single or double dot that
//    decreases in iteration
    public static void dots(int p, String print) {
        for (int o = 1; o <=SIZE - p; o++){
            System.out.print(print);
        }
    }


//    this function contains a for loop that prints either a single or double dot that
//    increases in iteration
    public static void dots2(int t, String print) {
        for (int v=1; v<= t-1; v++){
            System.out.print(print);
        }
    }

    //    this function contains a for loop that prints slashes pointing down that
//    increases in iteration
    public static void slashes2(int t) {
        for (int u = 1; u <= SIZE + 1 - t; u++) {
            System.out.print("\\/");
        }
    }

    //    this function contains a for loop that prints slashes pointing down that
    //    increases in iteration
    public static void differentSlashes(int j, String print){
            for (int i = 1; i <= j; i++) {
                System.out.print(print);
            }
        }

    //    this function prints out the top cone of the rocket
    public static void cone() {
        for (int j = 1; j <= (SIZE * 2) - 1; j++) {
            for (int m = 1; m <= (SIZE * 2) - j; m++) {
                System.out.print(" ");
            }
            differentSlashes(j, "/");
            System.out.print("**");
            differentSlashes(j, "\\");
            System.out.println();
        }
    }

    //    this function prints out the breaker that is used often between other
    //    pieces of the rocket
    public static void breaker() {
System.out.print("+");
        for(int n=1; n<= SIZE*2; n++) {
            System.out.print("=*");
        }
        System.out.println("+");
        }


    //    this function prints out the top and bottom boxes of the rocket
    public static void tdiamondbox(){
    for(int p=1; p<= SIZE; p++) {
        System.out.print("|");

        dots(p, ".");
        slashes(p);
        dots(p, "..");
        slashes(p);
        dots(p, ".");

        System.out.print("|");
        System.out.println();
    }
    }

    //    this function prints out the middle boxes of the rocket
    public static void bdiamondbox(){
        for(int t=1; t<= SIZE; t++){
            System.out.print("|");
            dots2(t,".");
            slashes2(t);
            dots2(t, "..");
            slashes2(t);
            dots2(t, ".");
            System.out.println("|");
        }
    }
}