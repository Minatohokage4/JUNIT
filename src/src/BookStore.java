package src;

public class BookStore 
{
	public double getDiscountBalance(double totalOrderPrice, int discount) 
	{
			double netBal = totalOrderPrice - (totalOrderPrice * discount / 100);
			return netBal;
	}
	public int getDiscount(double totalOrderPrice, int cusType, int coupon)
	{
		int discount = 0;
		if((cusType>=1)&&(cusType<=3))
		{			
				 if((totalOrderPrice>=0)&&(totalOrderPrice<1000)) discount=3;
			else if((totalOrderPrice>=1000)&&(totalOrderPrice<2000)) discount=5;
			else if((totalOrderPrice>=2000)&&(totalOrderPrice<3000)) discount=7;
			else if((totalOrderPrice>=3000)&&(totalOrderPrice<4000)) discount=10;
			else if((totalOrderPrice>=4000)&&(totalOrderPrice<5000)) discount=15;
			else if((totalOrderPrice>=5000)) discount = 20;	
    	
			//1. bronze member card --> additional 3% discount
			//2. silver member card --> additional 5% discount
			//3. gold member card --> additional 10% discount
			//999. not member
			if(cusType==1)discount += 3;
			else if(cusType==2)discount += 5;
			else if(cusType==3)discount += 10;		
			
			discount += coupon;
		}
		else if(cusType==999)
			discount = coupon;
		return discount;
	}
}

