import java.util.Scanner;

public class ChainMarketing {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        //head name
        System.out.println("\"'");
        String Head=scan.next();
      // y N
        System.out.println("");
        String ChildChk=scan.next();
        int HeadCommission= (5 * 5000) / 100,ChildCommission=(5*5000/100);
        if(ChildChk.equals("Y")){
            System.out.println("");
            String names=scan.next();
            String [] Childnames=names.split(",");
            HeadCommission=Childnames.length*(10*5000/100);
            int length=Childnames.length+1;
            System.out.println("TOTAL MEMBERS :"+length);
            System.out.println("COMMISSION DETAILS :");
            System.out.println(" "+Head+" :"+HeadCommission);
            for (int i=0;i< Childnames.length;i++){
                    System.out.println(""+Childnames[i]+" :"+ChildCommission);
            }
            System.out.println("");
            System.out.println("\"'");

        }else if(ChildChk.equals("N")) {
            System.out.println("Head " + Head + " Commission :" + HeadCommission);
            System.out.println("\"'");
        }
    }
}
