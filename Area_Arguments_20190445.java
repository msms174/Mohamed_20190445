/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hisham Samir
 */
public class Area_Arguments_20190445 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		
	double area=0.0;
	 
	if(args.length==0) {
		
		
		System.out.println("Using default Square side length is :4");
		area=4*4;
		System.out.println("Area of Square is : "+area);
			
	}
	else if(args.length==2 || args.length==3 ) 
	{
		String shape=args[0];
		
		if(shape.compareToIgnoreCase("square")==0)
		{
			System.out.println("Square side lenght is: "+args[1]);
			double side =Double.parseDouble(args[1]);
			area=side*side;
			System.out.println("Area of Square is: "+area);	
		}
		
		else if(shape.compareToIgnoreCase("Rectangle")==0) 
		{
			
			if(args.length==3) 
			{
				
				System.out.println("Rectangle length is: "+args[1]);
				double length=Double.parseDouble(args[1]);
				System.out.println("Rectangle width is: "+args[2]);
				double width=Double.parseDouble(args[2]);
				area=length*width;
				System.out.println("Area of Rectangle is: "+area);	
	
			}
			else
			{
				System.out.println("Wrong number of arguments.");
			}
		}
			else if(shape.compareToIgnoreCase("circle")==0) 
			{
				System.out.println("circle radius length is :"+args[1]);
				double redius=Double.parseDouble(args[1]);
				double pi=3.14;
				area=pi*redius*redius;
				System.out.println("Area of circle is: "+area);
				
				
			}
			else {
				System.out.println("undefined shape");
			}
		
		}
	else {
		System.out.println("wrong numer of argumants. please shows shape");
	}
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
    
}
