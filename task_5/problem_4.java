import java.util.HashMap;
import java.util.Scanner;
public class task5_4 {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int X=sc.nextInt();
 int Y=sc.nextInt();
 HashMap hm=new HashMap();
 for(int i=1;i<=X;i++)
 {
     hm.put(i,sc.nextInt());
 }
 int cnt=0;
 for(int i=1;i<=X;i++)
 {
     if(hm.containsValue((int)hm.get(i)+Y)&&hm.containsValue((int)hm.get(i)+(2*Y)))
             cnt++;
 }
 System.out.println(cnt);
}
}
