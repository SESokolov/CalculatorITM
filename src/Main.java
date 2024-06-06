/*
Приложение “Калькулятор”. Приложение читает из консоли введенные пользователем строки, числа,
арифметические операции проводимые между ними и выводит в консоль результат их выполнения.
1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.
   Данные передаются в одну строку!
2. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.
   На выходе числа не ограничиваются по величине и могут быть любыми.
3. Калькулятор умеет работать только с целыми числами.
4. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
5. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
   приложение выбрасывает исключение и завершает свою работу.
6. Результатом операции деления является целое число, остаток отбрасывается.
7. Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.
* */

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Метод принимает строку с арифметическим выражением между двумя числами и возвращать строку с результатом их выполнения
    public static String calc(String input) throws Exception {
        int numA;
        int numB;
        char[] operations = {'+', '-', '*', '/'}; // массив возможных арифметических операций
        int result;
        String[] parts = input.split(" "); // разбор введённой строки в массив
        if (parts.length < 3) { // если число элементов строки меньше 3, то строка не является правильным математическим выражением
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        } else if (parts.length > 4 && (Arrays.toString(operations).contains(parts[1]) & Arrays.toString(operations).contains(parts[3]))) { // если число элементов строки больше 4 и 2-ой и 4-ый - арифм. опериции, то строка не является правильным математическим выражением
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        else if (parts.length == 4) { // если число элементов строки равно 4, то строка является правильным математическим выражением
            throw new Exception("throws Exception");
        }
        else {
            try { // преобразеум элементы из строк в целые числа
                numA = Integer.parseInt(parts[0]);
                numB = Integer.parseInt(parts[2]);
            }
            catch (Exception e) {
                throw new InputMismatchException(e + "Аргументами могут быть только целые числа!");
            }
            if (numA < 1 || numA > 10 || numB < 1 || numB > 10) { // проверка на нахождение аргументов в диапазоне от 1 до 10
                throw new IOException("Числа не находятся в диапазоне от 1 до 10!");
            }
            result = switch (parts[1]) { // вычисляем математическое выражение
                case "+" -> numA + numB;
                case "-" -> numA - numB;
                case "*" -> numA * numB;
                case "/" -> numA / numB;
                default -> throw new IllegalArgumentException("Неверная операция!");
            };
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(calc(scanner.nextLine()));
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}