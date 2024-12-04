import  java.util.*;
class pt{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a&(a-1))==0)
        System.out.println("power of 2");
        else 
        System.out.println("not a power of 2");
    }
}