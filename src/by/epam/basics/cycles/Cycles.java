package by.epam.basics.cycles;

import java.time.LocalDate;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;


class Task_1 {

    // Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    //все числа от 1 до введенного пользователем числа

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число ");
        int x = scan.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= x) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.print("Сумма равна " + sum);
    }
}

class Task_2 {

    // Вычислить значения функции на отрезке [а,b] c шагом h: y=x если x>2 и y=-x если x<=2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а ");
        int a = scan.nextInt();
        System.out.println("Введите b ");
        int b = scan.nextInt();
        System.out.println("Введите h ");
        int h = scan.nextInt();
        int x = a;
        while (x >= a & x <= b) {
            if (x > 2) {
                System.out.println("y=" + x);
            } else {
                System.out.println("y=" + x * (-1));
            }
            x = x + h;
        }
    }
}

class Task_3 {

    //Найти сумму квадратов первых ста чисел.

    public static void main(String[] args) {
        long sum = 0;
        int i = 0;
        while (i <= 100) {
            sum = (long) (sum + Math.pow(i, 2));
            i = i + 1;
        }
        System.out.print("Сумма квадратов первых 100 чисел равна " + sum);
    }
}

class Task_4 {

    //Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {
        double product = 1;
        int i = 1;
        while (i <= 200) {
            product = product * Math.pow(i, 2);
            i = i + 1;
        }
        if (product == Infinity) {
            System.out.println("Выход за пределы, невозможно посчитать произведение в данном типе");
        } else {
            System.out.print("Произведение квадратов первых 200 чисел равно " + product);
        }
    }
}

class Task_5 {

    //Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид: an=1/2^n+1/3^n

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scan.nextInt();
        System.out.print("Введите e: ");
        double e = scan.nextDouble();
        double[] array = new double[n + 1];
        double sum = 0;
        int i = 1;
        array[0] = 0;
        while (i < n + 1) {
            array[i] = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(array[i]) >= e) {
                sum = sum + array[i];
            }
            i = i + 1;
        }
        System.out.print("Сумма равна " + sum);
    }
}

class Task_6 {

    //Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

    public static void main(String[] args) {
        int i = 1;
        char ch;
        while (i <= 255) {
            ch = (char) i;
            System.out.println(i + "____" + ch);
            i = i + 1;
        }
    }
}

class Task_7 {

    //Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    //m и n вводятся с клавиатуры.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scan.nextInt();
        System.out.print("Введите m: ");
        int i = scan.nextInt(), y = 2;
        while (i <= n) {
            System.out.print("Делители числа " + i + ": ");
            y = 2;
            while (y < i) {
                if (i % y == 0) System.out.print(y + " ");
                y++;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

class Task_8 {

    //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b = scan.nextInt();
        int l1 = String.valueOf(a).length();
        int l2 = String.valueOf(b).length();
        int i = 0;
        int[] array1 = new int[l1];
        int[] array2 = new int[l2];
        while (i < l1) {
            array1[i] = a % 10;
            a = a / 10;
            i++;
        }
        i = 0;
        while (i < l2) {
            array2[i] = b % 10;
            b = b / 10;
            i++;
        }
        i = 0;
        while (i < l1) {
            int y = 0;
            while (y < l2) {
                if (array1[i] == array2[y]) {
                    System.out.print(array1[i] + " ");
                }
                y = y + 1;
            }
            i++;
        }
    }
}
