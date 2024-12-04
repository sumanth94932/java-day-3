import java.util.*;
class set{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int p=s.nextInt();
        if((a&(1<<p))!=0)
        {
            System.out.println("it is a set");
        }
        else{
            System.out.println("not a set");
        }
    }
}