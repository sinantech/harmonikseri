import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number");
        int n = input.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        // 1.döngü i=1;result=0+(1/1)=1
        // 2.döngü i=2;result=1+(1/2)=1,5
        System.out.println(result);

    }
}
