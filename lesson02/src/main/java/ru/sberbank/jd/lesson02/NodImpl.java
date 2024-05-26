package ru.sberbank.jd.lesson02;

/**
 * Класс позволяет вычислить (метод сalculate) наибольший общий делитель двух целых чисел.
 */
public class NodImpl implements Nod {

    @Override
    public int calculate(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);

        if (second == 0) {
            return first;
        } else {
            return calculate(Math.abs(second), first % second);
        }
    }
}
