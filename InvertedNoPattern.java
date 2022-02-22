import java.util.Scanner;
public class InvertedNoPattern {


	public static void main(String[] args) {
		
		
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i =n;
        while(i>=1){
            int j =1;
            while(j<=n-i+1){
                System.out.print(i);
                j = j+1;
            }
            System.out.println();
            i =i-1;
        }
		
	}

}