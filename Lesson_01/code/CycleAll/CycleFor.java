package CycleAll;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            // Здесь всё устроено так:
            //
            //    int i = 1:
            //        Это инициализация . Мы создаём переменную i и задаём ей начальное значение 1.
            //        Это первая итерация.
            //
            //    i <= 5:
            //        Это условие . Цикл будет выполняться, пока i меньше или равно 5.
            //        Как только i станет больше 5, цикл остановится.
            //
            //    i++:
            //        Это обновление .
            //        После каждой итерации значение i увеличивается на 1 (то есть i = i + 1).
            //
            //Итерации в этом цикле
            //
            //Теперь давай посмотрим, как проходит каждая итерация:
            //
            //    1-я итерация : i равно 1 (выводим 1).
            //    2-я итерация : i увеличивается до 2 (выводим 2).
            //    3-я итерация : i увеличивается до 3 (выводим 3).
            //    4-я итерация : i увеличивается до 4 (выводим 4).
            //    5-я итерация : i увеличивается до 5 (выводим 5).
            //
            //После пятой итерации i становится 6, и условие i <= 5 становится ложным, поэтому цикл завершится.
            //Итог
            //
            //Таким образом, в этом цикле будет 5 итераций ,
            // каждая из которых соответствует одному проходу кода внутри цикла.
            // Каждая итерация — это один раз,
            // когда выполняется тело цикла с текущим значением i.

        }
    }

}
