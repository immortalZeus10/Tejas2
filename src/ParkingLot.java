import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        int row=Scan.nextInt();
        int col=Scan.nextInt();
        int [][] matrix=new int[row][col];
        int [] rowMatrix=new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix [i][j]=Scan.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix [i][j]==1){
                    rowMatrix[i]+=1;
                }
            }
        }
        int max=rowMatrix[1],maxOne=0;
        for (int i = 0; i < row; i++) {
            if (rowMatrix[i]>=max){
                max=rowMatrix[i];
                maxOne=i+1;
            }
        }
        System.out.println(maxOne);

    }
}
