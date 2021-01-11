package volcalWANDISOCalculator;

import java.util.Scanner;

public class mainCaller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// objects
		volcalCube volcalCube = new volcalCube();
		volcalSphere volcalSphere = new volcalSphere();
		volcalTetrahedron volcalTetranhedron = new volcalTetrahedron();

		int a, userInput;
		double ans = 0.00;
		// user input
		System.out.println("Calculate the volume of which shape? 1 Cube 2 Sphere 3 Tetrahedron: Enter number only: ");
		userInput = getInput(input);
		System.out.println("Enter whole number to calculate volume of your shape: ");
		a = getInput(input);
		input.close();

		// if on userInput
		if (userInput == 1) {
			ans = volcalCube.calculation(a);
			ans = volcalCube.decFormat(ans);

		} else if (userInput == 2) {
			ans = volcalSphere.calculation(a);
			ans = volcalSphere.decFormat(ans);

		} else if (userInput == 3) {
			ans = volcalTetranhedron.calculation(a);
			ans = volcalTetranhedron.decFormat(ans);

		} else {
			System.out.println("Please ensure you enter a number");
		}

		System.out.printf("The volume is: " + ans);
	}

	static int getInput(Scanner input) {
		return input.nextInt();
	}

}
