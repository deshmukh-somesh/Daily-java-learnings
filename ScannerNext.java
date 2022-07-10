import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args){
        String s = "20 somesh shivkumar ";

        Scanner scan  = new Scanner(s);
        // find the first token and print it..
        System.out.println(""+scan.nextInt());

        // find the next  token and print it..
        System.out.println(""+scan.next());
    }
}
