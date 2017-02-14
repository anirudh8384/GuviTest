
		import java.util.*;
		import java.lang.*;
		import java.io.*;


public class question{
	
			public static void main (String[] args) throws java.lang.Exception
			{
				Scanner sc = new Scanner(System.in);
				int no = sc.nextInt();
				if(no %2 == 0){
					System.out.println(no);
					System.out.println("even");
					}
					
					else{
						if(no == 1)
							System.out.println("Composite");
						else
							System.out.println("odd");
					}
				
		
		}
}
