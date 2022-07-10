import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args){
        String reg = "..\\d.\\..";
        String text = "so9m.s";

        Pattern pat  = Pattern.compile(reg);
        Matcher mat = pat.matcher(text);

        Boolean result = mat.matches();
        System.out.println(result);
    }
}
