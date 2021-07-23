package by.epam.basics.linear;

import java.io.*;
import java.util.Scanner;

import static java.lang.Math.*;

public class LinearPrograms {

    class Task1 {

        //Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

        public static void main(String[] args) {
            double a = 1, b = 5, c = 1, z = 1;
            z = ((a - 3) * b / 2) + c;
            System.out.println(z);
        }
    }

    class Task2 {

        // Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //(b + sqrt(Math.pow(b, 2) + 4 * a)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)

        public static void main(String[] args) {
            double a = 1, b = 1, c = 1;
            double function;
            function = (b + sqrt(Math.pow(b, 2) + 4 * a)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(function);
        }
    }

    class Task3 {

        //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //((sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y)

        public static void main(String[] args) {
            double x = 90, y = 30;
            double function;
            function = ((sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
            System.out.println(function);
        }
    }

    class Task4 {

        //Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
        //дробную и целую части числа и вывести полученное значение числа.

        public static void main(String[] args) {
            double function4 = 123.456;
            int f1 = (int) ((function4 * 1000) % 1000);
            int f2 = f1 % 10 * 100 + f1 % 100 - f1 % 10 + (int) f1 / 100;
            int f3 = (int) (function4);
            int f4 = f3 % 10 * 100 + f3 % 100 - f3 % 10 + (int) f3 / 100;
            double f5 = f2 + (double) f4 / 1000;

            System.out.println(function4);
            System.out.println(f5);

        }
    }


    class Task5 {

        //Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        //данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

        public static void main(String[] args) {
            int clock = 4682;
            int hour = clock / 3600;
            int min = (clock - hour * 3600) / 60;
            int sek = clock - hour * 3600 - min * 60;
            System.out.println(clock + " секунд - это " + hour + "ч " + min + "мин " + sek + "с.");
        }
    }

    class Task6 {

        //Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        //принадлежит закрашенной области, и false — в противном случае

        public static void main(String[] args) throws IOException {
            System.out.println("Введите х: ");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            System.out.println("Введите y: ");
            int y = scan.nextInt();
            if (((y >= -3) & (y <= 0) & (x >= -4) & (x <= 4)) || ((y >= 0) & (y <= 4) & (x >= -2) & (x <= 2))) {
                System.out.println("True!");
            } else {
                System.out.println("False!");
            }
        }
    }
}