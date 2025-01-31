package Task1;

public class Q6 {
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
