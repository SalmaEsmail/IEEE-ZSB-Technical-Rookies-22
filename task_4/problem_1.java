import java.util.Scanner;


public class Task_41 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
             int size = input.nextInt();
            int num=0;
            int i ,j,d =0;
	    int arr [] = new int [size]; 
	    for ( i = 0 ;i < size ; i++ ) {
	        arr[i] = input.nextInt(); 

	    }
           for (i = 0; i < size; i++) {
        for (j = i + 1; j < size; j++) {
            if(arr[i]==arr[j])
               {
                 d= (j-i);
                 if(d <= size) {
                     size = d;
               }
        
    }
    }
    
}
           System.out.println(d);
    }
}
