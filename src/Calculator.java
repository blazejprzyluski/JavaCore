import java.util.Scanner;

public class Calculator {
    public int sumUpTwoNumbers(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by 0, please put in different number!");
            return 0;
        } else if (b < 0){
            System.out.println("Argument smaller than 0, please put in different number!");
            return 0;
        } else {
            return a / b;
        }
    }

    public int divideWithProperNumber(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        boolean isWrongNumber = false;
        if(b == 0) {
            isWrongNumber = true;
        }
        while(isWrongNumber) {
            System.out.println("You put in wrong number, please put a number other than 0!");
            b = scanner.nextInt();
            if(b != 0) {
                isWrongNumber = false;
            }
        }

        return a / b;
    }
}
