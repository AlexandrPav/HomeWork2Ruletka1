//1.Оператор условия (if/else). Обеспечить ввод чисел от 1 до 6. Сгенерировать программой число от 1 до 6.
// Вывести оба на экран. Если числа совпадают – вывести сообщение о поражении, иначе – сообщение о победе.
//2.Цикл (while). Завести счетчик очков, изначально равный нулю. В случае победы, повторять игру, увеличивая счетчик на единицу.
// В случае поражения вывести сообщение о количестве заработанных очков.
//3.Массивы, цикл for. Сделать генерацию не одного числа, а трех.
// Если введенное пользователем число попадает в одно из них, то оповещать о поражении, иначе – повторять игру.
//4.Оператор условия (switch/case). Добавить выбор уровня сложности перед игрой.
// Для легкого уровня сложности генерировать одну пулю, для среднего две, для сложного три.
// За каждую сгенерированную пулю давать одно очко.

import java.util.Scanner;

public class Ruletka {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = intProverkaChisla(scanner, 1, 6);
        System.out.println(number);

        final int min1 = 1;
        final int max1 = 6;
        final int rnd = rnd(min1, max1);
        System.out.println("Случайное число " + rnd);

        resultat(number, rnd);
        intSchetchik(number, rnd);


    }

    public static int intProverkaChisla(Scanner scanner, int min, int max) {

        int num;
        while (true) {
            System.out.println("введите число от " + min + " до " + max);
            try {
                String stringNumbers = scanner.next();
                num = Integer.valueOf(stringNumbers);
            } catch (NumberFormatException e) {
                System.out.println("вы ввели не число");
                continue;
            }
            if (num < min || num > max) {
                System.out.println("число не от " + min + " до " + max);
                return intProverkaChisla(scanner, min, max);

            }
            return num;
        }
    }

    public static int rnd(int min1, int max1) {
        max1 -= min1;
        return (int) (Math.random() * ++max1) + min1;

    }

    public static int resultat(int rnd, int number) {
        if (number == rnd) {
            System.out.println("Вы програли ");
        } else if (number != rnd) {
            System.out.println("Вы выйграли ");
        }


        return number;
    }

    public static int intSchetchik(int number, int rnd) {
        while (true) {
            int nadbavka=100;
            for (int i = 1; i <= nadbavka; i++)
                System.out.println("Ваш счет: " + i);

            int Schetchik = scanner.nextInt();
            if (number != rnd) {
                System.out.println("+ 1 очко " + nadbavka);

                return Schetchik;


            } else if (number == rnd) {
                System.out.println("Ваш счет: " + nadbavka);


            }
            return Schetchik;
        }

    }

}








