import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Введите данные ");
        String task = scanner.nextLine();
        String[] splitTask = task.split(" ");
        if (splitTask.length > 3) {
            throw new Exception();
        }
        if (splitTask.length < 2) {
            throw new Exception("т.к. строка не является математической операцией");
        }
        int num1 = Integer.parseInt(splitTask[0]);
        int num2 = Integer.parseInt(splitTask[2]);
        String operation = splitTask[1];
        if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) {
            throw new Exception("т.к формат математической операции" +
                    " не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        switch (operation) {
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
            default:
                throw new Exception("т.к формат математической операции не удовлетворяет заданию" +
                        " - два операнда и один оператор (+, -, /, *)");
        }
        System.out.println("Ваш результат " + result);
    }
}


