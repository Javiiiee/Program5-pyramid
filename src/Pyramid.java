import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows?");
        int numRows = sc.nextInt();
        int row = 1;

        for (int i = numRows; i >0; i--){
            for(int j=1; j<=i*2; j++){
                System.out.print(" ");
            }
            for (int j =1; j <= row; j++){
                System.out.print((j+" "));
            }
            for (int j = row-1; j >=1; j--){
                System.out.print((j+" "));
            }
                    System.out.println();
                    row++;

        }

    }
}
