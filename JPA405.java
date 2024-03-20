public class JPA405{
    public static void main(String[] args){
        String a[] = {"A","B","C","D","E","F","G","H","I","J"};
        System.out.print("反轉陣列資料之前 : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
        System.out.print("反轉陣列資料之後 : ");
        for(int j=9;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}