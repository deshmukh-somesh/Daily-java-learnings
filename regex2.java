import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args){
        String reg ="[a-z&&[def]].";
        String str ="somesh";

        Pattern pat = Pattern.compile(reg);
        Matcher mat = pat.matcher(str);
        boolean result = mat.matches();
        System.out.println(result);
    }
}
