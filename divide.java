import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        System.out.println("Enter operation");
        char ch=sc.next().charAt(0);
        if(ch=='/'){
        System.out.println(n1/n2);
    }
    }
}
