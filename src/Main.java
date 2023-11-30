import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                try {
                    System.out.println("Введите число ");
                    System.out.print("-->" );
                    int num1 = scanner.nextInt();
                    if (num1<0){
                        throw new NegativeNumberException("ВВедено отрицательное число: " + num1);

                    }
                    System.out.println("вы ввели положительное число: " + num1);

                }catch (NegativeNumberException e ){
                    System.out.println("Error 404 " + e.getMessage());
                }
            }
        }
