
		import java.util.*;
		import java.lang.*;
		import java.io.*;


public class question{
	
			public static void main (String[] args) throws java.lang.Exception
			{
				int counter =0;
				int countDig =0;
				Scanner sc = new Scanner(System.in);
				//String no = sc.next();
				int myInt = sc.nextInt();
				if(myInt<0){
					myInt = myInt* -1;
					counter++;
				}
				while (myInt >= 1){
					System.out.println(myInt%10);		
						myInt = myInt/10;
						countDig++;
					}
				if(counter>0){
					System.out.println("negative");
				}
				System.out.println(countDig);
					
			}
}