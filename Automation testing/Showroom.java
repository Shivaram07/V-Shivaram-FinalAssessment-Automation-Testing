package javaoops;
import java.util.Scanner;
public class ShowRoom extends CarDetails1 {
	
	public ShowRoom(String version,String enginetype,String milage)
	{
		super(version,enginetype,milage);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner m= new Scanner(System.in);
		ShowRoom car1= new ShowRoom("Shiva vc1.0","petrol engine","15km/litre");
		ShowRoom car2= new ShowRoom("Shiva vc2.0","diesel engine","20km/litre");
		ShowRoom car3= new ShowRoom("Shiva vc3.0","electric engine","100km/charge");
	    ShowRoom bike1= new ShowRoom("Shiva vb1.0","petrol engine","50km/litre");
		ShowRoom bike2= new ShowRoom("Shiva vb2.0","diesel engine","60km/litre");
		ShowRoom bike3= new ShowRoom("Shiva vb3.0","electric engine","100km/litre");
		for(;;)
		{
		System.out.println("please select the vehicle type : 1.car  2.bike 3.exit ");
		n=m.nextInt();
		if(n==1)
		{
		for(;;) {
		
			System.out.println("Please select model 1.Shiva 1.0  2.Shiva 2.0  3.Shiva 3.0 4.exit ");
			int i=m.nextInt();
		switch(i)
		{
		case 1 : car1.versiontype();
		         car1.engine();
		         break;
		case 2 : car2.versiontype();
	             car2.engine();
	             break;  
		case 3 : car3.versiontype();
	             car3.engine();
	             break;
		case 4 :System.exit(0);
		
		default : System.out.println("Thanks for visiting");
		break;
		}
		}
		
	}
		else if(n==2)
		{
			for(;;) {
				
				System.out.println("Please select model 1.Shiva 1.0  2.Shiva 2.0  3.Shiva 3.0 4.exit ");
				int i=m.nextInt();
			switch(i)
			{
			case 1 : bike1.versiontype();
			         bike1.engine();
			         break;
			case 2 : bike2.versiontype();
		             bike2.engine();
		             break;  
			case 3 : bike3.versiontype();
		             bike3.engine();
		             break;
			case 4 :System.exit(i);
			
			default : System.out.println("Thanks for visiting");
			break;
			}
			}
		}else if(n==3)
		{
			System.exit(0);
		}
		}

}
	static 
	{
		System.out.println("Welcome to showroom!");
		
	}
} 





package javaoops;

public class CarDetails1 {
	
	static String companyname= "Shiva";
	String version ;
	String enginetype;
	String milage;
	
public	CarDetails1(String version,String enginetype,String milage)
	{
		this.version=version;
		this.enginetype=enginetype;
		this.milage=milage;
	}
	
   
	
	void versiontype()
	{
	System.out.println("companyname             : "+companyname);
	System.out.println("version of the vehicle  : "+version);
	
	}
	
	void engine()
	{
	System.out.println("enginetype              : "+enginetype);
	System.out.println("milage                  : "+milage);
	
	}

}