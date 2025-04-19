import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nHA! CAN'T DO MATH! OK GO ON CHECK MY CALCULATOR!!!!!");
            
            while (true) {
                System.out.println("Choose what do you wanna do...");
                System.out.println("Press the first natural number for simple calculator");
                System.out.println("Press even prime for logical calculator");
                System.out.println("Press first odd prime for scientific calculator");
                System.out.println("Press 0 to QUIT");

                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("Bye Bye Nerd 👋");
                    break;
                }

                switch (choice) {
                    case 1:
                        SimpleArithmetic sa = new SimpleArithmetic();
                        System.out.println("Haha 😂 select what do you wanna do:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Integer Division(//)\n5.Division(/)\n6.Exponentiation(^)\n7.Square Root");
                        int option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Enter the first number :");
                                long num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                long num2 = sc.nextLong();
                                long res = sa.add(num1, num2);
                                System.out.println("Result :" + res);
                                break;
                            case 2:
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                res = sa.subtract(num1, num2);
                                System.out.println("Result :" + res);
                                break;
                            case 3:
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                res = sa.multiply(num1, num2);
                                System.out.println("Result :" + res);
                                break;
                            case 4:
                                System.out.println("Don't you dare divide by ZERO!!");
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                try {
                                    res = sa.integerDivide(num1, num2);
                                    System.out.println("Result :" + res);
                                } catch (ArithmeticException e) {
                                    System.out.println("I told you not to divide by zero bruh!");
                                }
                                break;
                            case 5:
                                System.out.println("Don't you dare divide by ZERO!!");
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                try {
                                    res = sa.divide(num1, num2);
                                    System.out.println("Result :" + res);
                                } catch (ArithmeticException e) {
                                    System.out.println("I told you not to divide by zero bruh!");
                                }
                                break;
                            case 6:
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                double result = sa.exponentiation(num1, num2);
                                System.out.println("Result :" + result);
                                break;
                            case 7:
                                System.out.println("Enter the number :");
                                long num = sc.nextLong();
                                res = sa.sqRoot(num);
                                System.out.println("Result :" + res);
                                break;
                            default:
                                System.out.println("Get LOST");
                                break;
                        }
                        break;

                    case 2:
                        LogicalCalculator lc = new LogicalCalculator();
                        System.out.println("Ooh 😶 Select what you wanna do logically\n1.Bitwise AND\n2.Bitwise OR\n3.Bitwise NOT\n4.XOR\n5.XNOR");
                        int logicOption = sc.nextInt();

                        switch (logicOption) {
                            case 1:
                                System.out.println("Enter the first number :");
                                long num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                long num2 = sc.nextLong();
                                long res = lc.bitwiseAND(num1, num2);
                                System.out.println("Result :" + res);
                                break;
                            case 2:
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                res = lc.bitwiseOR(num1, num2);
                                System.out.println("Result :" + res);
                                break;
                            case 3:
                                System.out.println("Enter the number :");
                                long num = sc.nextLong();
                                res = lc.bitwiseNOT(num);
                                System.out.println("Result :" + res);
                                break;
                            case 4:
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                res = lc.XOR(num1, num2);
                                System.out.println("Result :" + res);
                                break;
                            case 5:
                                System.out.println("Enter the first number :");
                                num1 = sc.nextLong();
                                System.out.println("Enter the second number :");
                                num2 = sc.nextLong();
                                res = lc.XNOR(num1, num2);
                                System.out.println("Result :" + res);
                                break;
                            default:
                                System.out.println("Get LOST");
                                break;
                        }
                        break;

                    case 3: {
                        ScientificCalculator sci = new ScientificCalculator();
                        System.out.println("Whoa! Science 😎 Pick your poison:");
                        System.out.println("1. Sine (sin)");
                        System.out.println("2. Cosine (cos)");
                        System.out.println("3. Tangent (tan)");
                        System.out.println("4. Log base 10");
                        System.out.println("5. Natural log (ln)");
                        System.out.println("6. Factorial (n!)");
                        System.out.println("7. Absolute value (|x|)");
                        System.out.println("8. Modulus (x % y)");

                        int option3 = sc.nextInt();
                        switch (option3) {
                            case 1:
                                System.out.println("Enter angle in degrees:");
                                double deg = sc.nextDouble();
                                System.out.println("Result: " + sci.sin(deg));
                                break;
                            case 2:
                                System.out.println("Enter angle in degrees:");
                                double deg2 = sc.nextDouble();
                                System.out.println("Result: " + sci.cos(deg2));
                                break;
                            case 3:
                                System.out.println("Enter angle in degrees:");
                                double deg3 = sc.nextDouble();
                                System.out.println("Result: " + sci.tan(deg3));
                                break;
                            case 4:
                                System.out.println("Enter number:");
                                double x1 = sc.nextDouble();
                                System.out.println("Result: " + sci.log10(x1));
                                break;
                            case 5:
                                System.out.println("Enter number:");
                                double x2 = sc.nextDouble();
                                System.out.println("Result: " + sci.ln(x2));
                                break;
                            case 6:
                                System.out.println("Enter a non-negative integer:");
                                int n = sc.nextInt();
                                System.out.println("Result: " + sci.factorial(n));
                                break;
                            case 7:
                                System.out.println("Enter number:");
                                double x3 = sc.nextDouble();
                                System.out.println("Result: " + sci.abs(x3));
                                break;
                            case 8:
                                System.out.println("Enter first number:");
                                int a = sc.nextInt();
                                System.out.println("Enter second number:");
                                int b = sc.nextInt();
                                System.out.println("Result: " + sci.mod(a, b));
                                break;
                            default:
                                System.out.println("Get LOST");
                                break;
                        }
                        break;
                    }

                    default:
                        System.out.println("Seriously? Learn your numbers first. 🙄");
                        break;
                }
            }
        }
    }
}
