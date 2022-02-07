
import java.util.Scanner;

public class JavaApplication20 {

   
    public static void main(String[] args) {
         Scanner  input =new Scanner(System.in);
         int j=0;
        int t =input.nextInt();
        while(j<t)
        {
            int n=input.nextInt();
            int c=input.nextInt();
            int m=input.nextInt();
            int s=0;
            int z1=n/c;
            int z2;
            s=s+z1;
            if(z1>=m )
            {
                while(z1!=1 || z1!=0)
                {
                    z2=z1%m;
                    z1=z1/m;
                    s=s+z1;
                    z1=z1+z2;
                    if(z1<m)
                    {
                        break;
                    }
                }
            }
            System.out.println(s);
            j++;
        }
    }
    
}

