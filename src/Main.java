import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Задача 1: Четное или нечетное число
        //  Условие:
        //  Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.

        System.out.println("Введите число");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число " + num + " четное");
        }
        else {
            System.out.println("Число " + num + " нечетное");
        }
        // Задача 2: Минимальное из трех чисел
        // Условие:
        //Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.

        System.out.println("Первое число");
        int first = scanner.nextInt();
        System.out.println("Второе число");
        int second = scanner.nextInt();
        System.out.println("Третье число");
        int third = scanner.nextInt();
        System.out.printf("Максимальное число: " + Math.max(first, Math.max(second, third)));

        // Задача 3: Таблица умножения
        // Условие:
        // Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).

        for (int i = 1; i < 11; i++)
        {
            System.out.println("5 * " + i + " = " + i*5);
        }

        // Задача 4: Сумма чисел от 1 до N
        // Условие:
        // Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.

        System.out.println("Введите число N");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < N+1; i++)
        {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до " + N + " - " + sum);

        // Задача 5: Число Фибоначчи
        // Условие:
        // Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.

        System.out.println("Введите число N");
        int N = scanner.nextInt();
        System.out.println("Первые " + N + "числа Фибоначчи:");
        int a = 0, b = 1;
        for (int i = 0; i < N; i++)
        {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();

        // Задача 6: Проверка простого числа
        // Условие:
        // Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).

        System.out.println("Введите число");
        int num = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i < num; i++)
        {
            if (num == 1)
            {
                prime = false;
                break;
            }
            if (num % i == 0)
            {
                prime = false;
                break;
            }
        }
        if (prime)
        {
            System.out.println("Число " + num + " простое");
        }
        else
        {
            System.out.println("Число " + num + " не простое");
        }

        // Задача 7: Обратный порядок чисел
        // Условие:
        // Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.

        System.out.println("Введите число N");
        int N = scanner.nextInt();

        for (int i = N; i > 0; i--)
        {
            System.out.printf(i + " ");
        }
        System.out.println();

        // Задача 8: Сумма четных чисел
        // Условие:
        // Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).

        System.out.println("Введите первое число (А)");
        int A = scanner.nextInt();
        System.out.println("Введите первое число (В)");
        int B = scanner.nextInt();
        int sum = 0;
        for (int i = A; i < B+1; i++)
        {
            if (i%2 == 0)
            {
                sum += i;
            }
        }
        System.out.println("Сумма всех четных чисел от " + A + " до " + B + " - " + sum);

        // Задача 9: Реверс строки
        // Условие:
        // Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.

        System.out.println("Введите строку");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Строка в обратном порядке:\n" + reversed);

        // Задача 10: Количество цифр в числе
        // Условие:
        // Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.

        System.out.println("Введите число");
        String num = scanner.nextLine();
        System.out.println("Количество цифр в числе " + num + " - " + num.length());

        // Задача 11: Факториал числа
        // Условие:
        // Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!)

        System.out.println("Введите число");
        int N = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i < N+1; i ++)
        {
            factorial *= i;
        }
        System.out.println("Факториал числа " + N + " равен " + factorial);

        // Задача 12: Сумма цифр числа
        // Условие:
        // Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.

        System.out.println("Введите число");
        int num = scanner.nextInt();
        int sumnum = 0;
        while (num > 0)
        {
            sumnum += num%10;
            num /= 10;
        }
        System.out.println("Сумма всех цифр введеного 12числа - " + sumnum);

        // Задача 13: Палиндром
        // Условие:
        // Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).

        System.out.println("Введите строку");
        String str = scanner.nextLine().toLowerCase(Locale.ROOT);
        boolean pol = true;
        for (int i = 0; i < str.length()/2; i++)
        {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
            {
                pol = false;
                break;
            }
        }

        if (pol)
        {
            System.out.println("Строка - палиндром");
        }
        else
        {
            System.out.println("Строка - не палиндром");
        }

        // Задача 14: Найти максимальное число в массиве
        // Условие:
        // Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.

        System.out.println("Введите размер массива");
        int ras = scanner.nextInt();
        int[] mas = new int[ras];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < ras; i++)
        {
            mas[i] = scanner.nextInt();
        }
        System.out.println("Максимальный элемент массива - " + Arrays.stream(mas).max().getAsInt());

        // Задача 15: Сумма всех элементов массива
        // Условие:
        // Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.

        System.out.println("Введите размер массива");
        int ras = scanner.nextInt();
        int sum = 0;
        System.out.println("Введите элементы массива");
        for (int i = 0; i < ras; i++)
        {
            sum += scanner.nextInt();
        }
        System.out.println("Сумма элементов массива - " + sum);

        // Задача 16: Количество положительных и отрицательных чисел
        // Условие:
        // Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.

        System.out.println("Введите размер массива");
        int ras = scanner.nextInt();
        int[] mas = new int[ras];
        int otr = 0, pol = 0;
        System.out.println("Введите элементы массива");
        for (int i = 0; i < ras; i++)
        {
            mas[i] = scanner.nextInt();
            if (mas[i] > 0)
            {
                pol += 1;
            }
            if (mas[i] < 0)
            {
                otr += 1;
            }
        }
        System.out.println("В массиве " + pol + " положительных и " + otr + " отрицательных чисел");

        // Задача 17: Простые числа в диапазоне
        // Условие:
        // Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).

        System.out.println("Введите первое число (А)");
        int A = scanner.nextInt();
        System.out.println("Введите первое число (В)");
        int B = scanner.nextInt();
        System.out.println("Простые числа:");
        for (int i = A; i < B+1; i++)
        {
            boolean prime = true;
            if (i == 1)
            {
                prime = false;
            }
            else
            {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime)
            {
                System.out.println(i);
            }
        }

        // Задача 18: Подсчет гласных и согласных в строке
        // Условие:
        // Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.

        System.out.println("Введите строку");
        String str = scanner.nextLine();
        int gl = 0, sog = 0;
        String glr = "аеёиоуыэюя";
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < glr.length(); j++)
            {
                if (glr.charAt(j) == str.charAt(i))
                {
                    gl += 1;
                    break;
                }
                if (j == glr.length()-1 & glr.charAt(j) != str.charAt(i))
                {
                    sog += 1;
                }
            }
        }
        System.out.println("Гласных - " + gl + "\nСогласных - " + sog);

        // Задача 19: Перестановка слов в строке
        // Условие:
        // Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.

        System.out.println("Введите строку");
        String[] str = scanner.nextLine().split(" ");
        for (int i = str.length-1; i > -1; i--)
        {
            System.out.print(str[i] + " ");
        }
        System.out.println();

        // Задача 20: Число Армстронга
        // Условие:
        // Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга
        // (сумма цифр в степени, равной количеству цифр, равна самому числу).

        System.out.println("Введите число");
        String str = scanner.next();
        int num = Integer.parseInt(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            int num1 = num%10;
            sum += Math.pow(num1,str.length());
            num = num/10;
        }
        if (sum == Integer.parseInt(str))
        {
            System.out.println("Число Армстронга");
        }
        else
        {
            System.out.println("не число Армстронга");
        }

    }
}