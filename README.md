JAVA 17
Приложение “Калькулятор”.
Приложение читает из консоли введенные пользователем строки, числа, арифметические операции проводимые между ними и выводит в консоль результат их выполнения.

Требования:
1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифметическая операция передаются с новой строки считаются неверными.
2. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
3. Калькулятор умеет работать только с целыми числами.
4. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
5. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
6. Результатом операции деления является целое число, остаток отбрасывается. 
7. Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.

Пример работы программы:
Input:
1 + 2
Output:
3
Input:
1
Output:
throws Exception //т.к. строка не является математической операцией
Input:
1 + 2 1
Output:
throws Exception
Input:
1 + 2 + 3
Output:
throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)
