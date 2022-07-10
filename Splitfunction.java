public class Splitfunction {

    public static void main(String[] args){
        String s= "deshmukh somesh 4vv20cs031. This  is my USN.";
       String[] S = s.split("\\r?\\n");
        for(String str:S){
            System.out.print(str);

        }


    }
}
