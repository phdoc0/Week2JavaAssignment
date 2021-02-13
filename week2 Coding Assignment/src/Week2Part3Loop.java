
public class Week2Part3Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
a.	A while loop that prints all even numbers from 0 to 100
b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0
c.	A for loop that prints every other number from 1 to 100
d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		 */
		// I SEE WHEN I RUN THIS IN ONE WINDOW I HAVE TO MAKE EACH ONE A COMMENT IF VARIABLES ARE THE SAME IN LOOPS OTHERWISE IT'S AN ERROR,OR RUN THEM IN DIFFERENT PROJECTS
		
		
		//A 
		int x = 0;
		int y = 100;
		
		while (x < y) {
			System.out.println(x);
			x = x+2;
		} 
		
		
		//B.
		
		int x = 0;
		int y = 100;
		
		while (x < y) {
			System.out.println(y);
			y = y-3;
		} 
		
		// C. 
		
		   for (int i = 1; i <= 100; i+= 2) {
			System.out.println(i);
		} 
		
		
		// D. 
		
		for (int i = 0; i <= 100; i++) {

			if (i % 3 == 0) {
				System.out.println("Hello");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else if (i % 15 == 0) {
				System.out.println("HelloWorld");
			} else {
				System.out.println(i);
			}
		 

	}

}
}
