import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Object> results = new ArrayList<>();

        System.out.println("\n\n-------------------------------\n");
        while (true){
            try{
                System.out.println("Please choose one of the followings operations:");
                System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
                System.out.println("6.Minimum\n7.Maximum\n8.Average\n9.Print the last result\n10.print all results");
                System.out.println("Choose any other number to exit\n");

                int choice = input.nextInt();

                if (choice>10||choice<1){
                    System.out.println("See you later");
                    break;
                }

                if (choice==9){
                    System.out.println(results.getLast());
                    continue;
                }
                else if (choice==10) {
                    System.out.println(results);
                    continue;
                }

                System.out.println("Please enter your first number");
                int firstNumber = input.nextInt();
                System.out.println("Please enter your second number");
                int secondNumber = input.nextInt();

                switch (choice){
                    case 1:
                        results.add(addition(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                    case 2:
                        results.add(subtraction(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                    case 3:
                        results.add(multiplication(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                    case 4:
                        results.add(division(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                    case 5:
                        results.add(module(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                    case 6:
                        results.add(minimum(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                    case 7:
                        results.add(maximum(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                    case 8:
                        results.add(average(firstNumber,secondNumber));
                        System.out.println(results.getLast());
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("Please enter integers only");
                input.nextLine();//to avoid infinite loop
            }catch (ArithmeticException e){
                System.out.println("You can't divide by zero");
            }catch (NoSuchElementException e){
                System.out.println("You didn't use any operation yet");
            }catch (Exception e){
                System.out.println("I don't know what you did but don't do it again");
                System.out.println("Please email me that the error message \"" +e +"\" appeared: Waleedalthebiany@gmail.com");
            }
            System.out.println("\n\n-------------------------------\n");
        }
    }

    public static int addition(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
    public static int subtraction(int firstNumber, int secondNumber){
        return firstNumber-secondNumber;
    }
    public static int multiplication(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }
    public static double division(int firstNumber, int secondNumber)throws ArithmeticException{
        if (secondNumber==0)
            throw new ArithmeticException();
        return (double) firstNumber /secondNumber;
    }
    public static int module(int firstNumber, int secondNumber)throws ArithmeticException{
        return firstNumber%secondNumber;
    }
    public static int minimum(int firstNumber, int secondNumber){
        if (firstNumber<secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }
    public static int maximum(int firstNumber, int secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber;
        }
        return secondNumber;
    }
    public static double average(int firstNumber, int secondNumber){
        return (double) (firstNumber + secondNumber) /2;
    }

}