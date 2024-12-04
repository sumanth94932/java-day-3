import  java.util.*;
class ptf{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a&(a-3))==0)
        System.out.println("multiple of 4 ");
        else 
        System.out.println("not multiple of 4 ");
    }
}