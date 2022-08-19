import java.util.Scanner;

public class IntelligenceAgency {
    static int AddMethod(int N){
        int newNum=0;
        while(N>0){
            newNum+=N%10;
            N/=10;
        }
        return newNum;
    }
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        int N=Scan.nextInt();
        int R=Scan.nextInt();
        int newNum2=AddMethod(N);
        newNum2*=R;
        System.out.println(AddMethod(newNum2));
    }
}
