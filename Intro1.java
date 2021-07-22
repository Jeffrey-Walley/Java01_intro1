// this is a comment
public class Intro1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
}
}

/* multiline
comments in Java are just like Javascript and CSS
 */

/*JAVA Variables
  Variables are containers for storing data values.

  In Java, there are different types of variables, for example:

	String - stores text, such as "Hello". String values are surrounded by double quotes
	int - stores integers (whole numbers), without decimals, such as 123 or -123
	float - stores floating point numbers, with decimals, such as 19.99 or -19.99
	char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
	boolean - stores values with two states: true or false
 */

// string
	String name = "John" // strings use ""
	System.out.println(name);
// store #
	int myNum = 15;
	System.out.println(myNum);
// also declare without assigning value and assign later
	int myNum;
	myNum = 15;
	System.out.println(myNum); // assigning a new value to a Variable will overwrite the old value -- myNum = 15 now
// make *Read-Only* (const) by using the 'final' keyword
	final int myNum = 9;
	myNum = 20; // will generate an error - cannot assign a vaule to a final variable
// other types of variables
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";

/* Primitive Data Types
A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

Data Type	Size	Description
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
Numbers
Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
		Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
Floating point types represents numbers with a fractional part, containing one or more decimals.
		There are two types: float and double.
 */

// byte -128 and 127
	byte myNum = 100;
 	System.out.println(myNum);

// short -32768 and 32767
	short myNum = 5000;
	System.out.println(myNum);

// int -2147483648 and 2147483647 -- preferred data type for creating variables
	int myNum = 100000;
	System.out.println(myNum);

// long -9223372036854775808 and 9223372036854775807
	long myNum = 15000000000L; // must contain 'L' at end of value
	System.out.println(myNum);

// FLOATING Point Types
// Float
	float myNum = 5.75f; // must contain 'f' at end of value
	System.out.println(myNum);

// Double
	double nyNum = 19.9999d; // must contain 'd' at end of value
	System.out.println(myNum);

// Scientific Numbers -- the 'e' indicates power of 10

	float f1 = 35e3f;
	double d1 = 12E4d; // must be cap 'E'

// BOOLEAN accepts only 'true' or 'false'

		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false

// Charachter - 'char' used to store a single character must be surrounded by single quotes, like 'A' or 'c':

		char myGrade = 'B';
		System.out.println(myGrade);


