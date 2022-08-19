import java.util.Scanner;

public class FineCalculation {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        int sizOfArray=Scan.nextInt();
        System.out.println("");
        int [] lastNumbers=new int[sizOfArray];
        for (int i = 0; i < sizOfArray; i++) {
            lastNumbers[i]=Scan.nextInt();
        }
        System.out.println("");
        int day=Scan.nextInt();
        System.out.println("");
        int fine=Scan.nextInt();
        System.out.println("");
        int count=0;
        if (day>=1 && day<=30){

            if (day % 2 == 0){
                for (int i = 0; i < sizOfArray; i++) {
                    if (lastNumbers[i]%2 !=0){
                        count=count+1;
                    }
                }
            }else if (day % 2 !=0) {
                for (int i = 0; i < sizOfArray; i++) {
                    if (lastNumbers[i]%2 ==0){
                        count=count+1;
                    }
                }
            }
        }else {
            System.out.println("Enter Valid Day !");
        }
        int finalFine=count*fine;
        System.out.println("\"'");
        System.out.println("");
        System.out.println(finalFine);
        System.out.println("");
        System.out.println("\"'");
    }
}
