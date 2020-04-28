/*
6. Битовые операции
Во всех упражнениях нельзя использовать арифметические операторы сложения, умножения, вычитания, деления. Вместо них используем побитовые операторы &, |, ~, ^, <<, >>,>>>.

Входное число A имеет тип int. Номера битов всегда задаются корректно, то есть принимают значения от 0 до 31.

(A) Дано число n<32. Запишите число 2^n, то есть число, у которого n-й бит равен 1, а остальные – нули.
(B) Даны два неравных числа: n и m, не превосходящие 31. Вычислите 2^n+2^m.
(C) Дано целое число A и натуральное число i. Обнулите у числа A его младшие i бит и выведите результат.
(D) Дано целое число A и натуральное число i. Выведите число, которое получается из числа A установкой значения i-го бита равному 1.
(E) Дано целое число A и натуральное число i. Выведите число, которое получается из числа A инвертированием i-го бита.
(F) Дано целое число A и натуральное число i. Выведите число, которое получается из числа A установкой значения i-го бита равному 0.
(G) Дано целое число A и натуральное число n. Выведите число, которое состоит только из n младших бит числа A.
(H) Дано целое число A и натуральное число i. Выведите значение i-го бита числа A, то есть 0 или 1.
(I) Дано число типа byte. Выведите его в битовой форме: 8 бит, старшие биты слева, младшие – справа (не используя jdk api).

7. поменять значения двух переменных, не используя промежуточной переменной, 4мя способами: 2мя битовыми и 2мя арифметическими

 */

import java.util.Scanner;

public class lesson02 {
    public static void main(String[] args) {
        //start A)
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число от 0 до 31:");
        int n = number.nextInt();
        number.close();
        long result = 1;
        result = result << n;
        System.out.println("Сдвиг на " + n + " бит влево устанавливает бит " + n + " в 1 и дает число: " + result);
        //end A)


    }
}
