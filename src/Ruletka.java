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
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        intProverka();
        intRandom();

    }

    public static int intProverka() {    // Проверка числа
        System.out.println("Введите число от 1 до 6:");
        int num;
//        int num = scanner.nextInt();

        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
//        } else if (num == 1) {
//            System.out.println("Вы ввели 1");
//        } else if (num == 2) {
//            System.out.println("Вы ввели 2");
//        } else if (num == 3) {
//            System.out.println("Вы ввели 3");
//        } else if (num == 4) {
//            System.out.println("Вы ввели 4");
//        } else if (num == 5) {
//            System.out.println("Вы ввели 5");
//        } else if (num == 6) {
//            System.out.println("Вы ввели 6");
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = intProverka();
        }
        return num;
    }

    public static void intRandom() {                       // Генерация 1,2,3 числа
        int a1 = 1;
        int b1 = 6;
        int number1 = a1 + (int) (Math.random() * b1);
        System.out.println("1-ое случайное число: " + number1);
        int number2 = a1 + (int) (Math.random() * b1);
        System.out.println("2-ое случайное число: " + number2);
        int number3 = a1 + (int) (Math.random() * b1);
        System.out.println("3-е случайное число: " + number3);
    }

}


