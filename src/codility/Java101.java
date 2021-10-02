package codility;

public class Java101 {

	boolean bool;
	char char_;// 2 bytes
	byte byte_; // -128 to 127. 1 byte
	short short_;// -32,768 to 32,767. 2 byte
	int int_;// 2,147,483,648 to 2,147,483,647. 4 byte
	long long_;// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. 8 bytes
	float float_;// 4 bytes 6 to 7 decimal digits
	double double_;// 8 bytes 15 decimal digits

	/**
	 * A literal is a fixed value that we assign to a variable in a Program
	 * 
	 * int num=10;
	 * 
	 * Here value 10 is a Integer literal.
	 * 
	 * char ch = 'A';
	 * 
	 * Here A is a char literal
	 * 
	 * Always suffix float value with the “f” else compiler will consider it as
	 * double.
	 */
	public Java101() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * primitive data types
		 */
		Java101 d = new Java101();
		System.out.println("boolean: " + d.bool);
		System.out.println("char: " + d.char_);
		System.out.println("byte: " + d.byte_);
		System.out.println("short: " + d.short_);
		System.out.println("int: " + d.int_);
		System.out.println("long: " + d.long_);
		System.out.println("float: " + d.float_);
		System.out.println("double: " + d.double_);

		/**
		 * Types of Operator in Java
		 * 
		 * 1) Basic Arithmetic Operators: +, -, % for modulo , / division, *
		 * multiplication Note: Modulo operator returns remainder, for example 10 % 5
		 * would return 0
		 * 
		 * 2) Assignment Operators 
		 * 3) Auto-increment and Auto-decrement Operators  
		 * 4) Logical Operators 
		 * 5) Comparison (relational) operators 
		 * 6) Bitwise Operators:  
		 * There are six bitwise Operators:   
		 * & is bitwise and   
		 * | is bitwise or 
		 * ^ is bitwise XOR 
		 * ~ is bitwise compliment 
		 * << is left shift 
		 * >> is right shift   
		 * >>> is zero fill right shift   
		 * 7) Ternary Operator  
		 */

		int num1 = 100;
		int num2 = 200;
		num1++;
		num2--;

		System.out.println("num1++ is: " + num1);
		System.out.println("num2-- is: " + num2);

		int num11 = 100;
		int num22 = 200;
		++num11;
		--num22;

		System.out.println("++num11 is: " + num11);
		System.out.println("--num22 is: " + num22);

		System.out.println("++num11* is: " + (++num11));
		System.out.println("--num22* is: " + (--num22));

		System.out.println("++num11 is: " + (num11++));
		System.out.println("--num22 is: " + (num22--));

		/**
		 * bitwise operators, which can be applied to the integer types, long, int,
		 * short, char, and byte.
		 */
		int no1 = 11;
		int no2 = 22;
		int no3 = 12;
		System.out.println(Integer.toBinaryString(no1));// 1011
		System.out.println(Integer.toBinaryString(no2));// 10110
		System.out.println(Integer.toBinaryString(no3));// 1100

		/**
		 * 1011 & 10110 = 01011 = 11 10110 = 22 00010 = 2
		 * 
		 * 1011 & 1100 = 1011 = 11 1100 = 12 1000 = 8
		 * 
		 * 
		 * 1011 ^ 10110 01011 10110 11101
		 */

		System.out.println(no1 & no2);
		System.out.println(no1 & no3);
		System.out.println();

		System.out.println(
				(no1 ^ no2) + " " + toDec(Integer.toBinaryString(no1 ^ no2)) + " " + Integer.toBinaryString(no1 ^ no2));

		System.out.println();
		System.out.println(~no1);
		System.out.println(~no2);

		/**
		 * 
		 */
		System.out.println();
		/**
		 * 10110 left shift 10110. 10110.00 = 1011000
		 */
		System.out.println(no2 + " " + (no2 << 2) + " " + Integer.toBinaryString(no2 << 2));
		/**
		 * 10110 right shift 10110. 101.10 = 101
		 */
		System.out.println(no2 + " " + (no2 >> 2) + " " + Integer.toBinaryString(no2 >> 2));

		System.out.println();
		System.out.println(8 << 2);
		System.out.println(8 >> 2);

		System.out.println();
		System.out.println(8 << 1);
		System.out.println(8 >> 1);

		/**
		 * 101.10
		 */
		System.out.println();
		System.out.println(no2 >>> 2);
		System.out.println(no2 >> 2);

		System.out.println();
		String myNo = "1000";
		for (int i = 0; i < 10; i++) {
			System.out.print("item: " + i + "-");
			System.out.println(Integer.valueOf(myNo) << i);
			System.out.print(" #");
		}

		/**
		 * Operator Precedence in Java ++ – – ! ~
		 * 
		 */

		/**
		 * 
		 * control flow statements.
		 * 
		 * If, If..else Statement
		 * 
		 * loop
		 * 
		 * Switch case statement
		 */

		String input = "";
		myblock: switch (input) {

		case "v":

			break myblock;
		case "s":

			break;

		case "q":

			break;
		default:
			break;
		}
		
		/**
		 *    for(initialization; condition ; increment/decrement)
				{
				   statement(s);
				}
				
				// infinite loop
				for ( ; ; ) {
				    // statement(s)
				}
				
				while(condition)
				{
				   statement(s);
				}
				
				
				do
				{
				   statement(s);
				} while(condition);
		 */
		
		/**
		 * in while loop, condition is evaluated before the execution of loop’s body 
		 * but in do-while loop condition is evaluated after the execution of loop’s body.
		 */
		
		
		System.out.println();
		System.out.println("***1");
		int x = 0;
		do
		{
			System.out.println(x);
			x++;
			
		}while(x<10);
		
		System.out.println();
		System.out.println("***2");
		
		int y = 0;
		while(y<10) {
			System.out.println(y);
			y++;
		}
		
		
		/**
		 * Object: is a bundle of data and its behaviour(often known as methods).
		 * Objects have two characteristics: They have states and behaviors.
		 * 
		 *  Examples of states and behaviors
			Example 1:
			Object: House
			State: Address, Color, Area
			Behavior: Open door, close door
		 */
		
	}
	
	

	
	/**
	 * 
	 * @param bin
	 * @return
	 */
	static int toDec(String bin) {
		return Integer.parseInt(bin, 2);
	}

}
