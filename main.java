import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //local variable for the class and global variable main method
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("a is small");
            }
            else{
                System.out.println("c is small");
            }
    }else if(c<b){
        System.out.println("b is small");
   }
   else{
    System.out.println("c is small");
   }
}
}