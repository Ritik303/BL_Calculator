import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2){
            if(n1>n3){
                System.out.println("First number is largest");
            }
            else{
                System.out.println("Third number is largest");
            }
        }
        else{
            System.out.println("Second number is largest");
        }

    }
}
