import java.util.Scanner;
public class JPA406{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int a[] = new int[m];
        a[0] = 30;
        a[1] = 30;
        for(int i=1;i<a.length;i++){
            if(i<=1){
                a[i]+=a[i-1];
            }else if(i>1 && i<=3){
                a[i]+=(a[i-1]+50);
            }else if(i>3 && i<=5){
                a[i]+=(a[i-1]+80);
            }else{
                a[i]+=(a[i-1]+100);
            }
        }

        for(int i=1;i<a.length;i++){
            if(i==1){
                System.out.printf("停車時數 : %d小時",i+1);
                System.out.printf("\n應繳費用 : %d元整",a[i]);
                System.out.printf("\n");
            }else if(i==2){
                System.out.printf("停車時數 : %d小時",i+1);
                System.out.printf("\n應繳費用 : %d元整",a[i]);
                System.out.printf("\n");
            }else if(i==4){
                System.out.printf("停車時數 : %d小時",i+1);
                System.out.printf("\n應繳費用 : %d元整",a[i]);
                System.out.printf("\n");
            }else if(i==7){
                System.out.printf("停車時數 : %d小時",i+1);
                System.out.printf("\n應繳費用 : %d元整",a[i]);
                System.out.printf("\n");
            }
        }
    }
}