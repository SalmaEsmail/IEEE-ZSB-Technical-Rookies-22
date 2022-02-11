import java.util.Scanner;
public class Library {

   
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
        int d1 = input.nextInt();
          int m1= input.nextInt();
            int y1 = input.nextInt();
             int d2 = input.nextInt();
             int m2= input.nextInt();
            int y2 = input.nextInt();
             int fine = 0;
              if(d1<=d2 && m1<=m2 && y1<=y2){
        fine=0;
    }else if(d1>d2 && m1==m2 && y1==y2){
        fine=(d1-d2)*15;
    }else if(m1>m2 && y1==y2){
        fine=(m1-m2)*500;
    }else if(y1>y2 ){
        fine=(y1-y2)*10000;
    }
                  System.out.println(fine); 
              }                 
                      
                      
                      
                      
                      
               
        
    }
    


