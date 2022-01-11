import java.util.Scanner;
public class SalaryBreakupApp {

	public static void main(String[] args) {
		int id,j,i;
		String name;
		double salary,hra,pf,ta,esi,gpay,npay;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        id=in.nextInt();
        
        System.out.println("Enter Employee Name:");
        name=in.next();
        
        System.out.println("Enter Basic salary:");
        salary=in.nextDouble();
        
        hra=salary*0.02;
        pf=salary*0.03;
        ta=salary*0.01;
        esi=salary*0.025;
        gpay=salary+hra+pf+ta+esi;
        npay=gpay-pf;
        
        System.out.println("    Salary Breakup Application    ");
        
        	for(i=1;i<=20;i++)
        		System.out.print("- ");
             
        
        System.out.println("\r\n"+"Employee ID       :"+id);
        System.out.println("Employee Name     :"+name);
        System.out.println("Basic Salary      :"+salary);
        System.out.println("HRA               :"+hra);
        System.out.println("PF                :"+pf);
        System.out.println("TA                :"+ta);
        System.out.println("ESI               :"+esi);
        System.out.println("Gross Pay         :"+gpay);
        System.out.println("Net Pay           :"+npay);
        
        
	}

}
