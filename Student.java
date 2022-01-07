import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
	  	Scanner in = new Scanner(System.in);
	  	System.out.println("Enter Student ID");
	  	 int ID=in.nextInt();
	  	System.out.println("Enter Student Name");
	  	 String Name=in.next();
	  	System.out.println("Enter Marks for 6 sublects:");
	  	System.out.println("Sub1");
	  	 int sub1 = in.nextInt();
	  	System.out.println("Sub2:");
	  	 int sub2 = in.nextInt();
	  	System.out.println("Sub3:");
	  	 int sub3 = in.nextInt();
	  	System.out.println("Sub4:"); 
	  	 int sub4 = in.nextInt();
	  	System.out.println("Sub5:");
	  	 int sub5 = in.nextInt();
	  	System.out.println("Sub6:"); 
	  	 int sub6 = in.nextInt();
	  	
	  	int TotalMarks=sub1+sub2+sub3+sub4+sub5+sub6;
	  	System.out.println("Total Marks="+TotalMarks);
		System.out.println("Average="+TotalMarks/6);
		
		int i;
		for(i=1;i<=20;i++)
			System.out.print("*");
		
		System.out.println("Student ID="+ID);
		System.out.println("Student Name="+Name);
		System.out.println("Marks");
		System.out.println("sub1="+sub1);
        System.out.println("sub2="+sub2);
        System.out.println("sub3="+sub3);
        System.out.println("sub4="+sub4);
        System.out.println("sub5="+sub5);
        System.out.println("sub6="+sub6);
        
		double p=TotalMarks/600.0*100.0;
        if(p>35.00) { 
            System.out.printf("Total Marks="+TotalMarks+"  Percentage="+p+"  Result:PASS");
        }else {
            System.out.printf("Total Marks="+TotalMarks+"Percentage="+p+"Result:FAIL");

        }






	  	


	}

}
