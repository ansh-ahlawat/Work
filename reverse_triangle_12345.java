import java.util.*;
public class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print(i-j+1);
            }
            System.out.println("");
        }
    }
}
