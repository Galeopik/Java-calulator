import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите первое и второе число: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = 0;

        System.out.println("Выберите операцию: ");
        String operation = scanner.next();



        if (num1 > 0 && num1 <11 && num2 > 0 && num2 < 11){
        switch (operation){
            case "-":
                result = num1 - num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
            System.out.println("Ваш результат" + result);
        }else {
            System.out.println("throws Exception");
        }




    }

}