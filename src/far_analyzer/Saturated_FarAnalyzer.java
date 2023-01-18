package far_analyzer;

import java.util.*;

public class Saturated_FarAnalyzer {

	public static void main(String[] args)
	{
		Scanner number=new Scanner(System.in);
		Scanner text=new Scanner(System.in);
		
		System.out.printf("%80s %n","Dear user, welcome to the coffee saturated fat analyzer");
		System.out.println("This progarm calculates the saturated fat percentage presents in different types of coffee");
		
		System.out.printf("%80s %n","You can only calculate the saturated fat percentage for two types of coffee maximum");
		System.out.println("------------------------------------------Coffee saturated fat Analyzer------------------------------------------");
		
		System.out.printf("%80s %n","How many coffee types would you like to calculates the saturated fat percentage?");
		System.out.printf("%50s","Response:- ");
		int coffee_type=number.nextInt();
		
		if(coffee_type==1)
		{
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat calculation------------------------------------------");
			System.out.println("Coffee name:-");
			String coffe_name=text.nextLine();
			System.out.println("Saturated fat content(g):-");
			double sat_fatcontent=number.nextDouble();
			System.out.println("Total calories(cal):-");
			double calories=number.nextDouble();
			
			double sat_fatpercentage=((sat_fatcontent*9)/calories)*100;
			
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat calculation------------------------------------------");
			
			//display information received and calculated
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat statistics------------------------------------------");
			System.out.printf("%20s","Coffee Names");
			System.out.printf("%30s","saturated fat content(g)");
			System.out.printf("%30s","Total food calories(cal)");
			System.out.printf("%30s","saturated fat content(%)");
			
			System.out.println();
			
			
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat statistics------------------------------------------");
			System.out.printf("%20s",coffe_name);
			System.out.printf("%20s",sat_fatcontent);
			System.out.printf("%25s",calories);
			System.out.printf("%20s %.2f","",sat_fatpercentage);
			
		}//if
		
		else if(coffee_type==2)
		{
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat calculation------------------------------------------");
			System.out.println("first Coffee name:-");
			String coffe_name1=text.nextLine();
			System.out.println("Saturated fat content(g):-");
			double sat_fatcontent1=number.nextDouble();
			System.out.println("Total calories(cal):-");
			double calories1=number.nextDouble();
			
			double sat_fatpercentage1=((sat_fatcontent1*9)/calories1)*100;
			
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat calculation------------------------------------------");
			
			
			System.out.println("second Coffee name:-");
			String coffe_name2=text.nextLine();
			System.out.println("Saturated fat content(g):-");
			double sat_fatcontent2=number.nextDouble();
			System.out.println("Total calories(cal):-");
			double calories2=number.nextDouble();
			
			double sat_fatpercentage2=((sat_fatcontent2*9)/calories2)*100;
			
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat calculation------------------------------------------");
			
			//display information received and calculated
			System.out.printf("%80s %n","------------------------------------------Coffee saturated fat statistics------------------------------------------");
			System.out.printf("%20s","Coffee Names");
			System.out.printf("%30s","saturated fat content(g)");
			System.out.printf("%30s","Total food calories(cal)");
			System.out.printf("%30s","saturated fat content(%)");
			
			System.out.println();
			
			
			
			System.out.printf("%20s",coffe_name1);
			System.out.printf("%20s",sat_fatcontent1);
			System.out.printf("%25s",calories1);
			System.out.printf("%20s %.2f","",sat_fatpercentage1);
			
			System.out.println();
			
			
			System.out.printf("%20s",coffe_name2);
			System.out.printf("%20s",sat_fatcontent2);
			System.out.printf("%25s",calories2);
			System.out.printf("%20s %.2f","",sat_fatpercentage2);
			
			System.out.println();
			System.out.printf("%80s %n","------------------------------------------Final Result------------------------------------------");
		if(sat_fatpercentage1>sat_fatpercentage2)
		{
			System.out.println("The first type of coffee has a higher saturated fat percentage than the second type of coffee");
		}
		
		else if(sat_fatpercentage2>sat_fatpercentage1)
		{
			System.out.println("The second type of coffee has a higher saturated fat percentage than the first type of coffee");
		}
		
		}//else if
		
		else
		{
			System.out.println("Sorry, you can only calculate the saturated fat percentage for just two types of coffee maximum");
		}
		

	}

}
