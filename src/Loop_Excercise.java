import java.util.*;

public class Loop_Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		List<Integer> fiveNumbers = new ArrayList<>();
		
		Integer newNumber;
		Integer sum = 0;
		Integer product = 1;
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Please provide number " + i + ":");
			newNumber  = input.nextInt();
			fiveNumbers.add(newNumber);
			sum += newNumber;
			product *= newNumber;
		}
		
		System.out.println("The five numbers you provided are:" + fiveNumbers);
		System.out.println("The sum of these numbers is:" + sum);
		System.out.println("The product of these numbers is:" + product);
		fiveNumbers.sort(null);
		System.out.println("The smallest of these numbers is:" + fiveNumbers.get(0));
		System.out.println("The largest of these numbers is:" + fiveNumbers.get(4));	
	}

}
