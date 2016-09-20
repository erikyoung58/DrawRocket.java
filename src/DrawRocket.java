/**
 * Created by ecyou on 9/19/2016.
 */
public class DrawRocket {

    public static final int size = 3;

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

    public static void slashes(int p){
        for (int r=1; r<=p; r++){
            System.out.print("/\\");
        }
    }

    public static void dots(int p, String print) {
        for (int o = 1; o <=size - p; o++){
            System.out.print(print);
        }
    }

    public static void dots2(int t, String print) {
        for (int v=1; v<= t-1; v++){
            System.out.print(print);
        }
    }

    public static void slashes2(int t) {
        for (int u = 1; u <= size + 1 - t; u++) {
            System.out.print("\\/");
        }
    }

    public static void differentSlashes(int j, String print){
            for (int i = 1; i <= j; i++) {
                System.out.print(print);
            }
        }

    public static void cone() {
        for (int j = 1; j <= (size * 2) - 1; j++) {
            for (int m = 1; m <= (size * 2) - j; m++) {
                System.out.print(" ");
            }
            differentSlashes(j, "/");
            System.out.print("**");
            differentSlashes(j, "\\");
            System.out.println();
        }
    }

    public static void breaker() {
System.out.print("+");
        for(int n=1; n<= size*2; n++) {
            System.out.print("=*");
        }
        System.out.println("+");
        }

    public static void tdiamondbox(){
    for(int p=1; p<= size; p++) {
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

    public static void bdiamondbox(){
        for(int t=1; t<= size; t++){
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