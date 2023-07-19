import java.util.*;
class Main{
    static boolean fact(int num){
        int i=1;
        while(num>=1 && (num%i==0)){
            num=num/i;
            i++;
        }
        if(num==1){
            return true;
        }else{
        return false;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        num=in.nextInt();
        System.out.println(fact(num));
    }
}
