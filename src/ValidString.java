import java.util.Scanner;

public class ValidString {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        String InputString=Scan.next();
        int StarCount=0,HashCount=0;
        for (int i = 0; i < InputString.length(); i++) {
            char c=InputString.charAt(i);
            if(c=='*'){
                StarCount+=1;
            } else if (c=='#') {
                HashCount+=1;
            }
        }
        int finalAns=StarCount-HashCount;
        System.out.println(finalAns);
    }
}
