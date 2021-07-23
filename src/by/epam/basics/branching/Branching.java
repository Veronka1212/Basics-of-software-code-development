package by.epam.basics.branching;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.min;
    class Task1 {

        //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
        //он прямоугольным.

        public static void main(String[] args) throws IOException {
            System.out.println("Введите первый угол треугольника (в градусах): ");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            System.out.println("Введите второй угол треугольника (в градусах): ");
            int y = scan.nextInt();
            int z = x + y;
            if (z >= 180) {
                System.out.println("Такого треугольника не существует!");
            } else if ((x == 90) || (y == 90) || (y + x) == 90) {
                System.out.println("Треугольник существует и является прямоугольным.");
            } else if (z <= 180) {
                System.out.println("Треугольник существует.");
            }
        }
    }

    class Task2 {

        //Найти max{min(a, b), min(c, d)}

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите а ");
            double a = scan.nextDouble();
            System.out.print("Введите b ");
            double b = scan.nextDouble();
            System.out.print("Введите c ");
            double c = scan.nextDouble();
            System.out.print("Введите d ");
            double d = scan.nextDouble();
            double max = Math.max(min(a, b), min(c, d));
            System.out.print("max{min(a, b), min(c, d)}=" + max);
        }
    }

    class Task3 {

        //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите координату х1 точки A: ");
            double x1 = scan.nextDouble();
            System.out.print("Введите координату y1 точки A: ");
            double y1 = scan.nextDouble();
            System.out.print("Введите координату х2 точки B: ");
            double x2 = scan.nextDouble();
            System.out.print("Введите координату y2 точки B: ");
            double y2 = scan.nextDouble();
            System.out.print("Введите координату х3 точки C: ");
            double x3 = scan.nextDouble();
            System.out.print("Введите координату y3 точки C: ");
            double y3 = scan.nextDouble();
            double S = 0.5 * Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
            if (S == 0) {
                System.out.println("Точки лежат на одной линии.");
            } else System.out.println("Точки НЕ лежат на одной линии");
        }
    }

    class Task4 {

        //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
        //отверстие.

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите x кирпича: ");
            int x = scan.nextInt();
            System.out.print("Введите у кирпича: ");
            int y = scan.nextInt();
            System.out.print("Введите z кирпича: ");
            int z = scan.nextInt();
            System.out.print("Введите A ");
            int A = scan.nextInt();
            System.out.print("Введите B ");
            int B = scan.nextInt();
            if (((x <= A) & (y <= B)) | ((x <= A) & (z <= B)) | ((y <= A) & (z <= B)) | ((x <= B) & (y <= A)) | ((x <= B) & (z <= A)) | ((y <= B) & (z <= A))) {
                System.out.print("Проходит");
            } else System.out.print("НЕ проходит");
        }
    }


    class Task5 {

        //Вычислить значение функции: x^3-x*3+9 если x<=3 и 1/(x^3+6) если x>3

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите x: ");
            double x = scan.nextDouble();
            if (x <= 3) {
                System.out.print("Функция F(x)= " + Double.valueOf(Math.pow(x, 3) - x * 3 + 9));
            } else System.out.print("Функция F(x)= " + Double.valueOf(1 / (Math.pow(x, 3) + 6)));
        }
    }

