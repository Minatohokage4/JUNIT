package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BookStoreApp
{
	public static void main(String[] args) 
	{
		int discount;
		double  totalOrderPrice;
		int cusType, couponDiscount;
		double netBal;

		totalOrderPrice = stringToDouble(inputOutput("Enter the total order price:"));
		cusType = stringToInt(inputOutput("Enter customer type:"));
		couponDiscount = stringToInt(inputOutput("Enter bonous coupon:"));

		BookStore bookStore = new BookStore();
		discount = bookStore.getDiscount(totalOrderPrice, cusType, couponDiscount);
		netBal = bookStore.getDiscountBalance(totalOrderPrice, discount);
		System.out.println("-----------------------------------------------------");
		System.out.println("Total order price: " + totalOrderPrice);
		System.out.println("Total discount: " + discount);
		System.out.println("Net order price: " + netBal);
		
	}
	
	 /** 
     * Reading an input from user. 
     * @param the prompt message
     */
    public static String inputOutput(String message) {
        System.out.println(message);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String returnString = "";
	    try {
	        returnString = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println("Error reading in value");
	    }
	    return returnString;
    }
    
    /** 
     * Corverting string to double. 
     *  @param the string value
     */
    private static double stringToDouble(String value) {
        double returnDouble = -1;
        
        try {
            returnDouble = Double.parseDouble(value);
        }
        catch (NumberFormatException e) {
            System.out.println("Please input an Double\n");
        }
        return returnDouble;
    }
    
    /** 
     * Corverting string to integer. 
     * @param the string value
     */
    private static int stringToInt(String value) {
        int returnInt = -1;
        try {
            returnInt = Integer.parseInt(value);
           
        }
        catch (NumberFormatException e) {
            System.out.println("Please input an integer\n");
        }
        return returnInt;
    }
}
