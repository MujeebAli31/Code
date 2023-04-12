import java.util.Scanner;



public class heatindex {



	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("                                 NOAA's Nation Weather Service");
		System.out.println("                                       Heat Index");
		System.out.println("Relative                              Temperature(F)");
		System.out.println("Humidity%");
		System.out.printf("    ");
		for (int temperature=80; temperature<=110; temperature=temperature+2)
		{
			System.out.printf("%6s ",temperature);
		}
		System.out.println();
		System.out.println("____________________________________________________________________________________________________________________");
		for (int H=40; H<=100; H=H+5)
		{
			System.out.printf("%3s | ",H);
			for (int a=80;a<=110;a=a+2)
			{
				int sum=(int)(-42.379+(2.04901523*a)+(10.14333127*H)-(0.22475541*a*H)-(.00683783*a*a)-(.05481717*H*H)+(.00122874*a*a*H)+( .00085282*a*H*H)-(.00000199*a*a*H*H));
				if (sum<=137)
				{
					System.out.printf("%6s",sum);
					}
				    else 
				    {
				    	System.out.printf("%6s"," ");
				    	}
				}
			System.out.println();
			}
		boolean start=true;
		while(start==true)
		{
			System.out.print("Enter the temperature or 0 to end ");
			double inp=in.nextDouble();
			if(inp==0)
			{
				start=false;
				System.out.println("End of program");
				break;
				}
			System.out.print("Enter the relative humidity:  ");
			double 	Hinp=in.nextDouble();
			double fSum=(int)(-42.379+(2.04901523*inp)+(10.14333127*Hinp)-(.22475541*inp*Hinp)-(.00683783*inp*inp)-(.05481717*Hinp*Hinp)+(.00122874*inp*inp*Hinp)+( .00085282*inp*Hinp*Hinp)-(.00000199*inp*inp*Hinp*Hinp));
			System.out.print("THI for temperature "+inp+" and relative "+Hinp+" is:"+fSum+"");
			if (fSum<=90)
			{
				System.out.println(" Caution!!");
				}
			else if (fSum<105)
			{

				System.out.println("  Serious CAUTION!!");

			}

			else if (fSum<126)

			{

				System.out.println(" DANGEROUS");

			}

			

			else 

			{

				System.out.println("  Serious DANGER");

			}

			

			

			

			

			

			

			

			

			

		}
	}

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	}