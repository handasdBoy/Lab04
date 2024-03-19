import java.util.Scanner;
public class JPA402{
    public static void main(String[] args){
        System.out.print("請輸入學生人數:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double c=0.0;
        double m;
        double b[] = new double[a];
        for(int i=0;i<b.length;i++){
            System.out.printf("第%d個學生的成績:",(i+1));
            b[i] = s.nextDouble();
            c=c+b[i];
        }
        double d = (double)c/a;
        System.out.println("人數:"+a);
        System.out.printf("總分:"+c);
        System.out.printf("\n平均:"+d);
    }
}
