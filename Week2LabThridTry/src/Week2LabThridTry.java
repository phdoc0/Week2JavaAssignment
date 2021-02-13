
public class Week2LabThridTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int age = 14;
		
		System.out.println(age >=16);
		
		//false bc age is less than 16
		
		age = 19;
		System.out.println(age >= 18);
		
		if (age >- 16) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		boolean hasLicense = true;
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		double costOfMilk = 2.59;
		int thristLevel = 7;
		
		if (costOfMilk < 2.5 || thristLevel > 6){
			System.out.println("Milk Please");
			} else { 
				System.out.println("No Thanks");
				}
		
		int numberOfCookies = 10;
		int numberOfChildren = 7;
		
		if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		} else if (numberOfCookies % numberOfChildren >=2) {
			System.out.println("Whoohoooo!");
		} else if (numberOfCookies % numberOfChildren >0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		
		String loyaltyMemberStatus ="PLATINUM";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = .1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
		}
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal = 58.00;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus ="PLATINUM";
			}
		}
		System.out.println(loyaltyMemberStatus);
		
		String username = "RobertB";
		String password = "Robert1234";
		
		if (username == "RobertB" && password == "Robert1234") {
			System.out.println("login succussful");
		} else {
			System.out.println("access denied");
		}
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 100; i+= 2) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
			System.out.println(i + " even");
		} else {
			System.out.println(i + " odd");
		}
			
			int x = 100;
			while (x > 0) {
				System.out.println(x % 3);
				x --;
			}
	}
	

	}

}
