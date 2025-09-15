/* Java program to pass Command Line Argument for Input*/

class CommandLineDemo{
	public static void main (String[] args){
		int number1, number2 , sum;
		String name;
		
		name= args[0];
		number1 = Integer.parseInt(args[1]);
		number2 = Integer.parseInt(args[2]);
		sum = number1+number2;
		System.out.println(name + "is Java Programmer" );
		System.out.println("The sum of 2 number is"+ sum );
	}


}