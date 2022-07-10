import java.util.regex.Pattern;
public class regex3 {
    public static void main(String[] args){
        System.out.println(Pattern.matches("[a-z&&[def]]","abc"));
        System.out.println(Pattern.matches("[a-z&&[def]]","d"));
        System.out.println(Pattern.matches("[a-z&&[def]]","ef"));

        System.out.println("[ ]");

        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

        System.out.println("[x+]"); // one or more

        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aam"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)


        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)

        System.out.println(Pattern.matches("[amn]*", "amnamnamn"));//true (a or m or n may come zero or more times)

    }
}
