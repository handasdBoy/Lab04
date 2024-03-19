import java.util.Scanner;
public class JPA01{
    public static void main(String[] args){
        System.out.println("請輸入10個整數:");
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];
        int m = 0;
        int n = 0;
        for(int i=0;i<a.length;i++){
            System.out.printf("第%d個整數:",(i+1));
            a[i] = s.nextInt();
            if(a[i]>60){
                n++;
                m+=a[i];
            }
        }
        double b = m/n*1.0;
        System.out.printf("陣列中大於60的有%d個",n);
        System.out.print("\n");
        System.out.println("總合為"+m);
        System.out.printf("平均值為%.6f",b);
    }
}