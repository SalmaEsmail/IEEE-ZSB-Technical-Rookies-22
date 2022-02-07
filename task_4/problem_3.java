import java.util.Scanner;
public class Library {

   
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
        int day1 = input.nextInt();
          int month1= input.nextInt();
            int year1 = input.nextInt();
             int day2 = input.nextInt();
             int month2= input.nextInt();
            int year2 = input.nextInt();
             int fine = 0;
              if(year1 == year2 || year1 <= year2 ){
                  if ( month1 ==  month2 ||  month1<= month2){
                      if (day1 == day2 || day1 <= day2){
                          fine = 0;
                      }
                      else
                      fine = (day1 - day2)* 15;
                          
                          
                  }
                else
            fine = (month1 - month1) * 500;
              }
              else {
                   fine = 10000;
                  System.out.println(fine); 
              }                 
                      
                      
                      
                      
                      
               
        
    }
    
}

