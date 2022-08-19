import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        int number=Scan.nextInt();
        int product=1;
        while(number>0){
            product*=number%10;
            number/=10;
        }
        System.out.println(product);
    }
}
