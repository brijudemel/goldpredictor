import java.util.Scanner;

class Solution{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            String I=sc.next();
            String P=sc.next();
            int li=I.length();
            int pi=P.length();
            int tr=0;
            int pp=0;
            int ans=1;
            int cc=0;
            for(int i=0;i<li;i++){
                int flag=0;
                for(int j=0;j<pi;j++){
                    if(I.charAt(i)==P.charAt(j)){
                        flag=1;
                        tr+=(cc-j);
                        cc=j;
                        break;
                    }
                }
                if(flag==0){
                    ans=0;
                    break;
                }
            }
            if(ans==0){
                System.out.println("Case #"+(T+1)+": IMPOSSIBLE");
                
            }
            else{
                System.out.println("Case #"+(T+1)+": "+tr);
            }
            
            
            
            T--;
        }
    }
}