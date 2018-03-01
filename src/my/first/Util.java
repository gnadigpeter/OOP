package my.first;

public class Util {

	public static void calculate(String operator, double firstnumber, double secondnumber)

	{
		System.out.print("result: ");
		switch (operator) {
		case "-":
			System.out.println(firstnumber - secondnumber);
			break;
		case "+":
			System.out.println(firstnumber + secondnumber);
			break;
		case "/":
			if (!secondnumber.equals(0.0))
				System.out.println(firstnumber / secondnumber);
			else
				System.out.println("Cannot divide with 0");
			break;
		case "*":
			System.out.println(firstnumber * secondnumber);
			break;
		default:
			System.out.println("unknow operator");
			break;
		}
	}

}
