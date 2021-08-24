import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci series");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Fibonacci.fseries(num);
    }
    public static void fseries(int n){
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.println(i);
            sum+=i;
            System.out.println(sum);
        }
    }
}
