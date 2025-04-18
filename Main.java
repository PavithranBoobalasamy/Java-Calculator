import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("HA! CAN'T DO MATH! OK GO ON CHECK MY CALCULATOR!!!!!");
            System.out.println("Choose what do you wanna do...\nPress the first natural number for simple calculator\nPress even prime for logical calculator\nPress first odd prime for scientific calculator");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    SimpleArithmetic sa = new SimpleArithmetic();
                    System.out.println("Haha 😂 select what do you wanna do:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Integer Division(//)\n5.Division(/)\n6.Exponentiation(^)\n7.Square Root");
                    int option = sc.nextInt();
                    switch(option){
                        case 1:
                            System.out.println("Enter the first number :");
                            long num1 = sc.nextLong();
                            System.out.println("Enter the second number :");
                            long num2 = sc.nextLong();
                            long res = sa.add(num1,num2);
                            System.out.println("Result :"+res);
                            break;

                        case 2:
                            System.out.println("Enter the first number :");
                            long num1 = sc.nextLong();
                            System.out.println("Enter the second number :");
                            long num2 = sc.nextLong();
                            long res = sa.subtract(num1,num2);
                            System.out.println("Result :"+res);
                            break;

                        case 3:
                            System.out.println("Enter the first number :");
                            long num1 = sc.nextLong();
                            System.out.println("Enter the second number :");
                            long num2 = sc.nextLong();
                            long res = sa.multiply(num1,num2);
                            System.out.println("Result :"+res);
                            break;

                        case 4:
                            System.out.println("Don't you dare divide by ZERO!!");
                            System.out.println("Enter the first number :");
                            long num1 = sc.nextLong();
                            System.out.println("Enter the second number :");
                            long num2 = sc.nextLong();
                            try{
                                long res = sa.integerDivide(num1,num2);
                                System.out.println("Result :"+res);
                            }
                            catch(ArithmeticException e){
                                System.out.println("I told you not to divide by zero bruh!");
                            }
                            break;

                        case 5:
                            System.out.println("Don't you dare divide by ZERO!!");
                            System.out.println("Enter the first number :");
                            long num1 = sc.nextLong();
                            System.out.println("Enter the second number :");
                            long num2 = sc.nextLong();
                            try{
                                long res = sa.divide(num1,num2);
                                System.out.println("Result :"+res);
                            }
                            catch(ArithmeticException e){
                                System.out.println("I told you not to divide by zero bruh!");
                            }
                            break;

                        case 6:
                            System.out.println("Enter the first number :");
                            long num1 = sc.nextLong();
                            System.out.println("Enter the second number :");
                            long num2 = sc.nextLong();
                            long res = sa.exponentiation(num1,num2);
                            System.out.println("Result :"+res);
                            break;

                        case 7:
                            System.out.println("Enter the number :");
                            long num = sc.nextLong();
                            long res = sa.sqRoot(num);
                            System.out.println("Result :"+res);
                            break;

                        default:
                            System.out.println("Get LOST");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Ooh 😶 Select what you wanna do logically\n1.AND\n2.OR\n3.NOT\n4.XOR\n5.XNOR\n6.Bitwise AND\n7.Bitwise OR\n8.Bitwise NOT");

            
                default:
                    break;
            }
        }
        
    }
}