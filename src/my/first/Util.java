package my.first;

public class Util {

	public static void calculate(String operator, Double firstNumber, Double secondNumber)

	{
		System.out.print("result: ");
		switch (operator) {
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "/":
			if (!secondNumber.equals(0.0))
				System.out.println(firstNumber / secondNumber);
			else
				System.out.println("Cannot divide with 0");
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		default:
			System.out.println("unknow operator");
			break;
		}
	}

}
