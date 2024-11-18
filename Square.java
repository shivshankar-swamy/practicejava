import java.util.Scanner;
public class Square {
    public static void main(String[] aggs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number \n");
        int  num=sc.nextInt();
        double sq=Math.sqrt(num);
        if(num==sq*sq){
            System.out.println(sq);
        }
        else{
            System.out.println("number is not a perfet square");
        }
        sc.close();
    }
}
