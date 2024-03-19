public class JPA403{
    public static void main(String[] args){
        System.out.println("陣列A的內容為(3x3):");
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = {{7,8,9},{10,11,12}};
        int m = a.length;
        int n = a[0].length;
        int c[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf(" "+"%-2d",a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.println("陣列B的內容為(3x3):");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%2d ",b[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("陣列A+B=C，陣列C的內容為(3x3):");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%2d ",c[i][j]);
            }
            System.out.print("\n");
        }
    }   
}