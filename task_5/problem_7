import java.io.; import java.util.; 
import java.text.; 
import java.math.;
import java.util.regex.*;

public class task5_7 {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    String topic[] = new String[n];
    for(int topic_i=0; topic_i < n; topic_i++){
        topic[topic_i] = in.next();
    }
    int max=0;int count=0;
    for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
            {
            count=0;
            if(i!=j)
                {
                for(int k=0;k<m;k++)
            {
                   if((topic[i].charAt(k)=='0')&&(topic[j].charAt(k))=='0')
                                        ;
                                else
                                count++;
                }  
                           if(count>max)
                             max=count;

            }
        }
    }
               int scount=0;int teams=0;
               for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
            {scount=0;
            if(i!=j)
                {
                for(int k=0;k<m;k++)
            {
                    if((topic[i].charAt(k)=='0')&&(topic[j].charAt(k)=='0'))
                                        ;
                                        else
                                        scount++;
            }
                            if(scount==max)
                              teams++;

            }
        }
    }
                    System.out.println(max);
                    System.out.println(teams/2);

}
}
