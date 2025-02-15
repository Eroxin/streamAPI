package org.example;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        // Разделяем строку на массив строк по пробелам
        String[] numberArray = numbers.split(" ");

        // Инициализируем переменные для хранения минимального и максимального значений
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Проходим по каждому элементу массива
        for (String num : numberArray) {
            // Преобразуем строку в число
            int currentNum = Integer.parseInt(num);

            // Обновляем минимальное и максимальное значения
            if (currentNum < min) {
                min = currentNum;
            }
            if (currentNum > max) {
                max = currentNum;
            }
        }

        // Возвращаем результат в виде строки "max min"
        return max + " " + min;
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(highAndLow("1 2 3 4 5"));      // Вывод: "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));     // Вывод: "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));     // Вывод: "9 -5"
    }
}