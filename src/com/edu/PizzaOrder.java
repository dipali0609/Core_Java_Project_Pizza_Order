package com.edu;
import java.util.Scanner;

class PizzaBase
{
	private int price;
	private boolean veg;
	private int extraCheesPrice=100;
	private int extraTopinPrice=150;
	private int takePrice=20;
	private int basepizzaPrice;
	private boolean addExtrachessAdded;
	private boolean addExtraTopinAdded;
	private boolean addtakeAdded;
	
 public PizzaBase(Boolean veg)
{
	this.veg=veg;
	if(this.veg)
	{
		this.price=300;
	}
	else
	{
		this.price=400;
	}
	basepizzaPrice=this.price;
	
}
public void addExtraChees()
{
	addExtrachessAdded=true;
	this.price+=extraCheesPrice;
}
public void addExtraToping()
{
	addExtraTopinAdded=true;
	this.price+=extraTopinPrice;
}
public void takeaway()
{
	addtakeAdded=true;
	this.price+=takePrice;
}
public void getBill()
{
	String bill="";
	System.out.println("Pizza Price::"+basepizzaPrice);
	if(addExtrachessAdded)
	{
		bill+="Extra Chess added::"+extraCheesPrice+"\n";
	}
	if(addExtraTopinAdded)
	{
		bill+="Extra Toppings added::"+extraTopinPrice+"\n";
	}
	if(addtakeAdded)
	{
		bill+="Extra takeAway added::"+takePrice+"\n";
	}
	bill+="Bill:"+this.price+"\n";
	System.out.println(bill);
}
}
class Pizaadilux extends PizzaBase
{

	public Pizaadilux(Boolean veg) 
	{
		super(veg);
		super.addExtraChees();
		super.addExtraToping();
		
	}

	@Override
	public void addExtraChees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addExtraToping() {
		// TODO Auto-generated method stub
	
	}

	
	
}

public class PizzaOrder
{
	public static void main(String[] args) {
//		PizzaBase ob=new PizzaBase(false);
//		
//		ob.addExtraToping();
//		ob.getBill();
		
//		Pizaadilux ob=new Pizaadilux(true);
//		ob.getBill();
//		ob.takeaway();
		
   
//		Pizaadilux ob1=new Pizaadilux(true);
		Scanner sc=new Scanner(System.in);
		System.out.println("***Welcome To Pizza Order Application***");
		
	int ch=2,ch1,c ;
	String choice,choice1;
	System.out.println();
	System.out.println(">>Order Pizza>>");
	System.out.println("PizzaBase or PizzaDilux");
			do
			{
				choice=sc.next();
				
			switch(choice)
			{
			     case "PizzaBase": 
			             System.out.println("Veg Or Non-veg");
			             
			             do
			             {
			            	 choice1=sc.next();
			            	 switch(choice1)
			            	 {
			            	 case "veg":PizzaBase ob=new PizzaBase(true);
			            	 System.out.println("1 VEG EXTRAVAGANZA \n2 MEXICAN GREEN WAVE \n3 CHEESE N CORN \n4 MARGHERITA");
			            	 do
			            	 {
			            		c=sc.nextInt();
			            		switch(c)
			            		{
			            		case 1:System.out.println("VEG EXTRAVAGANZA");
			            		System.out.println("1 for Add Extra Cheess\n2 Press for Add Extra Topins \n3 for Add Take Away\n4 Bill \n5 Exit");
				            	 do
				            	 {
				            		ch1=sc.nextInt();
				            		switch(ch1)
				            		{
				            		case 1:ob.addExtraChees();
				            		System.out.println("Extra Cheess Added Successfuly");
				            		break;
				            		case 2:ob.addExtraToping();
				            		System.out.println("Extra Toppings Added Successfuly");
				            		break;
				            		case 3:ob.takeaway();
				            		System.out.println("Extra TakeAway Added Successfuly");
				            		break;
				            		case 4:System.out.println("**Veg Pizza Bill**");
				            			ob.getBill();
				            		
				            		break;
				            		case 5:break;
				            		
				            		
				            		}
				            	 }while(ch1<5);
			            			break;
			            			
			            			
			            		case 2:System.out.println("MEXICAN GREEN WAVE");
			            		System.out.println("1 for Add Extra Cheess\n2 Press for Add Extra Topins \n3 for Add Take Away\n4 Bill \n5 Exit");
				            	 do
				            	 {
				            		ch1=sc.nextInt();
				            		switch(ch1)
				            		{
				            		case 1:ob.addExtraChees();
				            		System.out.println("Extra Cheess Added Successfuly");
				            		break;
				            		case 2:ob.addExtraToping();
				            		System.out.println("Extra Toppings Added Successfuly");
				            		break;
				            		case 3:ob.takeaway();
				            		System.out.println("Extra TakeAway Added Successfuly");
				            		break;
				            		case 4:System.out.println("**Veg Pizza Bill**");
				            			ob.getBill();
				            		
				            		break;
				            		case 5:break;
				            		
				            		
				            		}
				            	 }while(ch1<5);
			            			break;
			            			
			            		case 3:System.out.println("CHEESE N CORN");
			            		System.out.println("1 for Add Extra Cheess\n2 Press for Add Extra Topins \n3 for Add Take Away\n4 Bill \n5 Exit");
				            	 do
				            	 {
				            		ch1=sc.nextInt();
				            		switch(ch1)
				            		{
				            		case 1:ob.addExtraChees();
				            		System.out.println("Extra Cheess Added Successfuly");
				            		break;
				            		case 2:ob.addExtraToping();
				            		System.out.println("Extra Toppings Added Successfuly");
				            		break;
				            		case 3:ob.takeaway();
				            		System.out.println("Extra TakeAway Added Successfuly");
				            		break;
				            		case 4:System.out.println("**Veg Pizza Bill**");
				            			ob.getBill();
				            		
				            		break;
				            		case 5:break;
				            		
				            		
				            		}
				            	 }while(ch1<5);
			            			break;
			            			
			            		case 4:System.out.println("MARGHERITA");
			            		System.out.println("1 for Add Extra Cheess\n2 for Add Extra Topins \n3 for Add Take Away\n4 Bill \n5 Exit");
				            	 do
				            	 {
				            		ch1=sc.nextInt();
				            		switch(ch1)
				            		{
				            		case 1:ob.addExtraChees();
				            		System.out.println("Extra Cheess Added Successfuly");
				            		break;
				            		case 2:ob.addExtraToping();
				            		System.out.println("Extra Toppings Added Successfuly");
				            		break;
				            		case 3:ob.takeaway();
				            		System.out.println("Extra TakeAway Added Successfuly");
				            		break;
				            		case 4:System.out.println("**Veg Pizza Bill**");
				            			ob.getBill();
				            		
				            		break;
				            		case 5:break;
				            		
				            		
				            		}
				            	 }while(ch1<5);
			            			break;

			            		}
			            	 }while(c!=2);
			            	 
			            	 
			            	 
			            		 break;
			            		 
			            		 
			            	 case "Non-veg": PizzaBase ob1=new PizzaBase(false);
			            	  System.out.println("1 Jerked Chicken Pizza \n2 Meat Lovers Pizza \n3 Classic Chicken Pizza");
			            	  do
			            	  {
			            		  c=sc.nextInt();
			            		  switch(c)
			            		  {
			            		  case 1:System.out.println("Jerked Chicken Pizza");
			            		  System.out.println("1 for Add Extra Cheess\n2 for Add Extra Topins \n3 for Add Take Away\n4 Bill \n5 Exit");
					            	 do
					            	 {
					            		ch1=sc.nextInt();
					            		switch(ch1)
					            		{
					            		case 1:ob1.addExtraChees();
					            		System.out.println("Extra Cheess Added Successfuly");
					            		break;
					            		case 2:ob1.addExtraToping();
					            		System.out.println("Extra Topins Added Successfuly");
					            		break;
					            		case 3:ob1.takeaway();
					            		System.out.println("Extra TakeAway Added Successfuly");
					            		break;
					            		case 4:System.out.println("**Non-Veg Pizza Bill**");
					            			ob1.getBill();
					            		break;
					            		case 5:break;
					            		
					            		}
					            	 }while(ch1<5);
			            		  break;
					            	 
			            		  case 2:System.out.println("Meat Lovers Pizza");
			            		  System.out.println("1 for Add Extra Cheess\n2 for Add Extra Topins \n3 for Add Take Away\n4 Bill \n5 Exit");
					            	 do
					            	 {
					            		ch1=sc.nextInt();
					            		switch(ch1)
					            		{
					            		case 1:ob1.addExtraChees();
					            		System.out.println("Extra Cheess Added Successfuly");
					            		break;
					            		case 2:ob1.addExtraToping();
					            		System.out.println("Extra Topins Added Successfuly");
					            		break;
					            		case 3:ob1.takeaway();
					            		System.out.println("Extra TakeAway Added Successfuly");
					            		break;
					            		case 4:System.out.println("**Non-Veg Pizza Bill**");
					            			ob1.getBill();
					            		break;
					            		case 5:break;
					            		
					            		}
					            	 }while(ch1<5);
			            		  break;
			            		  
			            		  case 3:System.out.println(" Classic Chicken Pizza");
			            		  System.out.println("1 for Add Extra Cheess\n2 for Add Extra Topins \n3 for Add Take Away\n4 Bill \n5 Exit");
					            	 do
					            	 {
					            		ch1=sc.nextInt();
					            		switch(ch1)
					            		{
					            		case 1:ob1.addExtraChees();
					            		System.out.println("Extra Cheess Added Successfuly");
					            		break;
					            		case 2:ob1.addExtraToping();
					            		System.out.println("Extra Topins Added Successfuly");
					            		break;
					            		case 3:ob1.takeaway();
					            		System.out.println("Extra TakeAway Added Successfuly");
					            		break;
					            		case 4:System.out.println("**Non-Veg Pizza Bill**");
					            			ob1.getBill();
					            		break;
					            		case 5:break;
					            		  
							    		  
					            		}
					            	 }while(ch1<7);
			            		  break;
			            		  
			            		  
			            		  }
			            	  }while(c!=2);
				            	
			            		 break;
			            	 }
			             }while(ch<3);
			             break;
			             
		      
			             
			     case "PizzaDilux":System.out.println("Veg Or Non-veg");
			              do
			              {
			            	     choice1=sc.next();
				            	 switch(choice1)
				            	 {
				            	 case "veg":PizzaBase ob=new PizzaBase(true); 
				            	 System.out.println("1 VEG EXTRAVAGANZA \n2 MEXICAN GREEN WAVE \n3 CHEESE N CORN");
				            	 do
				            	 {
				            		 c=sc.nextInt();
				            		 switch(c)
				            		 {
				            		 case 1:System.out.println("VEG EXTRAVAGANZA");
				            			 System.out.println("**Veg Pizza Bill**");
				            	           ob.addExtraChees();
				            	           ob.addExtraToping();
				            	           ob.takeaway();
				            	           ob.getBill();
				            		  break;
				            		 case 2:System.out.println("MEXICAN GREEN WAVE");
			            			 System.out.println("**Veg Pizza Bill**");
			            	           ob.addExtraChees();
			            	           ob.addExtraToping();
			            	           ob.takeaway();
			            	           ob.getBill();
			            		     break;
				            		 case 3:System.out.println("CHEESE N CORN");
			            			 System.out.println("**Veg Pizza Bill**");
			            	           ob.addExtraChees();
			            	           ob.addExtraToping();
			            	           ob.takeaway();
			            	           ob.getBill();
			            		     break;
				            		  
				            
				            		 }
				            	 }while(c!=2);
				            	
				            	 break;
				            	 
				            	 case "Non-veg":PizzaBase ob1=new PizzaBase(false);
				            	 System.out.println("1 Jerked Chicken Pizza \n2 Meat Lovers Pizza \n3 Classic Chicken Pizza");
				            	 do
				            	 {
				            		c=sc.nextInt();
				            		switch(c)
				            		{
				            		case 1:System.out.println("Jerked Chicken Pizza");
				            			System.out.println("**Non-Veg Pizza Bill**");
					            	   ob1.addExtraChees();
			            	           ob1.addExtraToping();
			            	           ob1.takeaway();
			            	           ob1.getBill();
				            			break;
				            			
				            		case 2:System.out.println("Meat Lovers Pizza");
			            			System.out.println("**Non-Veg Pizza Bill**");
				            	   ob1.addExtraChees();
		            	           ob1.addExtraToping();
		            	           ob1.takeaway();
		            	           ob1.getBill();
			            			break;
			            			
				            		case 3:System.out.println("Classic Chicken Pizza");
			            			System.out.println("**Non-Veg Pizza Bill**");
				            	   ob1.addExtraChees();
		            	           ob1.addExtraToping();
		            	           ob1.takeaway();
		            	           ob1.getBill();
			            			break;
			            			
				            		}
				            	 }while(c!=2);
				            	
				            	 break;
				            	 }
			              }while(ch<3);
			    	 break;
			
			}
			
			}while(ch<3);
				
			
	}
	
}
//switch(choice1)
//{
//case "veg":PizzaBase ob=new PizzaBase(true);
//      System.out.println("1 for Add Extra Cheess\n 2 for Add Extra Topins \n 3 for Add Take Away\n 4 Bill");
//}


//	 do
//	    {
//	    switch(ch)
//	    {
//	    case 1:ob.addExtraChees();
//	    break;
//	    case 2:ob.addExtraToping();
//	    break;
//	    case 3:ob.takeaway();
//	    break;
//	    case 4: ob.getBill();
//	    break;
//	    }
//	    }while(ch<=3);
//	    break;
//	    
//	    case "Non-veg":
//	    	break;
//	    }
//	    }
//	break;
//	
//	
//	case "PizzaDilux":Pizaadilux ob1=new Pizaadilux(true);
//		break;
//	
////break;
//case "Non-veg":ob.addExtraToping();
//ob.getBill();
//break;
//default:System.out.println("wrong");
