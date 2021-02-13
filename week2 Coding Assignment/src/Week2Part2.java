

public class Week2Part2 {

	public static void main(String[] args) {
		// TODO Auto-generatetrued method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 2.49;
		double moneyInWallet = 50.00;
		int thirstLevel = 8; 
		
/* Using the variables you created above and Boolean operators, create variables for the following scenarios:
a.	shouldByIcecream  – this should be true if it is hot outside and there is money in your pocket
b.	willGoSwimming – this should be true if it is hot outside and it is not a weekday
c.	isAGoodDay – this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
d.	willBuyMilk – this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk.*/
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldByIcecream);
		
		//even though this shows true i'm not sure i did this correctly
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket;
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = hasMoneyInPocket && thirstLevel >= 3 && (thirstLevel >= costOfMilk*2);
		System.out.println(willBuyMilk);

	}

}
